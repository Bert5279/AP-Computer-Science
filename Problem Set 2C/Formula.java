/**
 * AP Computer Science
 *
 * BY 
 */
public class Formula
{
    public Formula(){

    }

    public OrderedPair findQuadraticRoots(double a,double b, double c){
        double x1=(-b+Math.sqrt(b*b-4*a*c))/2/a;
        double x2=(-b-Math.sqrt(b*b-4*a*c))/2/a;
        return new OrderedPair(x1,x2);
    }

    public double findSlope(OrderedPair A,OrderedPair B){
        double x=(-A.x+B.x);
        double y=(-A.y+B.y);
        return y/x;
    }

    public OrderedPair findMidpoint(OrderedPair A,OrderedPair B){
        double x=(A.x+B.x)/2;
        double y=(A.y+B.y)/2;
        return new OrderedPair(x,y);
    }

    public double findArithmetricSeriesSum(double a,double d,double k){
        return k/2*(2*a+d*(k-1));
    }

    public double findGeometricSeriesSum(double a,double r,double k){
        return a*((1-Math.pow(r,k))/(1-r));
    }
    
    public int rollDie(int sides){
        return (int)(Math.random()*(sides+1));
    }
}
