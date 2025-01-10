/**
 * AP Computer Science
 *
 * BY 
 */

import java.util.*;

public class Driver
{
    public static void main (String[] args) {
        Fraction a=new Fraction(3,9); // 1/3
        Fraction b=new Fraction(4,8); // 1/2
        System.out.println(Fraction.add(a,b));
    }

    public static void GCF(int a, int b){
        int big=Integer.max(a,b);
        int small=Integer.min(a,b);
        while(small!=big&&small!=1){
            int temp=big-small;
            big=Integer.max(temp,small);
            small=Integer.min(temp,small);
            System.out.println(big+" "+small);
        }
        // System.out.print(1);
    }

    public static String askString(String question){
        Scanner ask = new Scanner(System.in);
        System.out.print(question);
        String temp = ask.nextLine();
        ask.close();
        return temp;
    }

    public static void Question2(){
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
        String temp="";
        int countT=0;
        int countW=0;
        while(!temp.equals("quit")){
            Fraction a=Fraction.random(1,10);
            Fraction b=Fraction.random(1,10);
            int operator=(int)(Math.random()*4);
            System.out.print("\n"+(countT+1)+". ");
            Fraction ans = generateQuestion(a,b,operator);
            temp=askString("");
            if(temp.equals(ans.toString()) || ((ans.getNum()+"").equals(temp)&&ans.getDenom()==1) ){
                System.out.println("\nCorrect!");
                countW++;
            } else {
                System.out.println("\nWrong, the answer is "+ans);
            }
            countT++;
        }
        System.out.println("Your win/loss ratio was "+new Fraction(countW,countT-1)+", for a score of "+countW*100/(countT-1));
    }

    public static Fraction generateQuestion(Fraction a, Fraction b, int ope){
        String operator="";
        Fraction ans= new Fraction();
        if(ope==0){
            operator=" + ";
            ans=Fraction.add(a,b);
        } else if(ope==1){
            operator=" - ";
            ans=Fraction.subtract(a,b);
        } else if(ope==2){
            operator=" / ";
            ans=Fraction.divide(a,b);
        } else if(ope==3){
            operator=" * ";
            ans=Fraction.multiply(a,b);
        }
        System.out.print("("+a+")"+operator+"("+b+")"+" = ");
        return ans;
    }

    public static void Question1(){
        Fraction MILU = new Fraction ("101863/32424");
        final double PI = Math.PI;
        double EPSILON = Math.abs(PI-MILU.toDouble());
        int count=0;
        int time=1;
        while(time>=0){
            while(Math.abs(PI-MILU.toDouble())>=EPSILON){
                double rst=Math.abs(MILU.toDouble());
                if(rst>PI){
                    MILU.setDenom(MILU.getDenom()+1);
                } else if(rst<PI){
                    MILU.setNum(MILU.getNum()+1);
                }
                count++;
                System.out.println(count+" "+MILU+" "+MILU.toDouble());
            }
            EPSILON = Math.abs(PI-MILU.toDouble());
            time--;
        }
        System.out.println(MILU);
    }
}

