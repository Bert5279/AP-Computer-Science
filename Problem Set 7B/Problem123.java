import java.util.*;

/**
 * AP Computer Science
 *
 * BY 
 */
public class Problem123
{
    public static void main (String[] args) {

    }

    public static ArrayList<Integer> EratosthenesPrime (int num){
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i=2; i<=num; i++){
            temp.add(i);
        }

        for(int i=0; i<temp.size(); i++){
            for(int n=temp.size()-1; n>i; n--){
                if(temp.get(n)%temp.get(i)==0){
                    temp.remove(n);
                }
            }
        }

        return temp;
    }

    public static void GoldbachConjecture (int num)  {
        ArrayList<Integer> temp = EratosthenesPrime(num);
        for(int i=0; i<temp.size(); i++){
            int a=temp.get(i);
            int b=0;
            for(int n=temp.size()-1; n>=i; n--){
                b=temp.get(n);
                if(a+b==num){
                    System.out.println(num+ " = " +a+ " + " + b);
                } 
            }
        }

    }

    public static void addBigInts(String a, String b){
        ArrayList<Integer> A= new ArrayList<Integer>();
        ArrayList<Integer> B= new ArrayList<Integer>();
        ArrayList<Integer> C= new ArrayList<Integer>();

        for(int i=0; i<a.length(); i++){
            A.add(Integer.parseInt(a.substring(i,i+1)));
        }
        for(int i=0; i<b.length(); i++){
            B.add(Integer.parseInt(b.substring(i,i+1)));
        }

        int al=A.size();
        int bl=B.size();

        if(al>bl){
            for(int i=0; i<al-bl; i++){
                B.add(0,0);
            }
        } else if(bl>al){
            for(int i=0; i<bl-al; i++){
                A.add(0,0);
            }  
        }
        
        A.add(0,0);
        B.add(0,0);
        
        for(int i=A.size()-1; i>=0; i--){
            int c=A.get(i);
            int d=B.get(i);
            C.add(0,(c+d)%10);
            if(c+d>=10){
                A.set(i-1,A.get(i-1)+1);
            }
        }
        
        System.out.print(a+" + "+b+" = ");
        for(int i=0; i<C.size(); i++){
            System.out.print(C.get(i));
        }
    }
}
