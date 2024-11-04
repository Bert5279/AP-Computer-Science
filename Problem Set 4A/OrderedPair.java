/**
 * AP Computer Science
 *
 * BY 
 */
public class OrderedPair
{
    public double x,y;

    OrderedPair(){
        x=0;
        y=0;
    }

    OrderedPair(double X,double Y){
        x=X;
        y=Y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public String toString(){
        return ("("+x+","+y+")");   
    }
    
    public OrderedPair findMidpoint(OrderedPair a, OrderedPair b){
        return new OrderedPair(  (a.x+b.x)/2  ,  (a.y+b.y)/2  );
    }
}
