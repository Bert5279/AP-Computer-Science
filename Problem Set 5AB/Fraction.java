/**
 * AP Computer Science
 *
 * BY 
 */
import java.util.*;

public class Fraction
{
    private int Numerator=0;
    private int Denominator=1;

    public Fraction(){

    }

    public Fraction(int n, int d){
        Numerator=n;
        Denominator=d;
    }

    public Fraction(Fraction f){
        Numerator=f.Numerator;
        Denominator=f.Denominator;
    }

    public Fraction(String f){
        int i=f.indexOf("/");
        int l=f.length();
        if(i>0){
            Numerator=Integer.parseInt(f.substring(0,i));
        }
        if(i<l-1){
            Denominator=Integer.parseInt(f.substring(i+1));
        }
    }

    public Fraction reduce(){
        int i=GCF(Numerator, Denominator);
        Numerator/=i;
        Denominator/=i;
        return new Fraction(Numerator, Denominator);
    }

    public int setNum(int n){
        Numerator=n;
        return n;
    }

    public int setDenom(int n){
        Denominator=n;
        return n;
    }

    public static Fraction add(Fraction a, Fraction b){
        int A=a.Numerator;
        int B=a.Denominator;
        int C=b.Numerator;
        int D=b.Denominator;
        return new Fraction(A*D+B*C,B*D).reduce();
    }

    public static Fraction subtract(Fraction a, Fraction b){
        int A=a.Numerator;
        int B=a.Denominator;
        int C=b.Numerator;
        int D=b.Denominator;
        return new Fraction(A*D-B*C,B*D).reduce();
    }

    public static Fraction multiply(Fraction a, Fraction b){
        int A=a.Numerator;
        int B=a.Denominator;
        int C=b.Numerator;
        int D=b.Denominator;
        return new Fraction(A*C,B*D).reduce();
    }

    public static Fraction divide(Fraction a, Fraction b){
        int A=a.Numerator;
        int B=a.Denominator;
        int C=b.Numerator;
        int D=b.Denominator;
        return new Fraction(A*D,B*C).reduce();
    }

    private static int GCF(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);
        int big=Math.abs(Integer.max(a,b));
        int small=Math.abs(Integer.min(a,b));
        while(small!=big&&small!=1){
            int temp=big-small;
            big=Integer.max(temp,small);
            small=Integer.min(temp,small);
        }
        return Math.abs(small);
    }

    public String toString(){
        return (Numerator+"/"+Denominator);
    }
    
    public double toDouble(){
        return Numerator*1.0/Denominator;
    }
    
    public int getNum(){
        return Numerator;
    }
    
    public int getDenom(){
        return Denominator;
    }
    
    public static Fraction random(int lower, int upper){
        int num=(int)(Math.random()*(upper-lower+1))+lower;
        int denom=(int)(Math.random()*(upper-lower+1))+lower;
        return new Fraction(num,denom);
    }
}

