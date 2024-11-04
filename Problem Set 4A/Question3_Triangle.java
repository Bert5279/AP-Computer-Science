/**
 * AP Computer Science
 *
 * BY 
 */
public class Question3_Triangle
{
    public static void line(double x1, double y1, double x2, double y2){
        StdDraw.line(x1,y1,x2,y2);
    }

    public static void line(OrderedPair a,OrderedPair b){
        StdDraw.line(a.x,a.y,b.x,b.y);
    }

    public static OrderedPair findMidpoint(OrderedPair a, OrderedPair b){
        return new OrderedPair(  (a.x+b.x)/2  ,  (a.y+b.y)/2  );
    }

    public static void triangle(OrderedPair a,OrderedPair b, OrderedPair c){
        line(a.x,a.y,b.x,b.y);
        line(a.x,a.y,c.x,c.y);
        line(c.x,c.y,b.x,b.y);
    }

    public static void point(OrderedPair a){
        StdDraw.point(a.x,a.y);
    }

    public static void drawSierpinskiTriangle(int howManyTimes){
        OrderedPair p1 = new OrderedPair(0,0);
        OrderedPair p2 = new OrderedPair(1,0);
        OrderedPair p3 = new OrderedPair(0.5,0.5*Math.sqrt(3));

        StdDraw.line(p1.x,p1.y,p2.x,p2.y);
        StdDraw.line(p3.x,p3.y,p2.x,p2.y);
        StdDraw.line(p1.x,p1.y,p3.x,p3.y);

        OrderedPair temp = findMidpoint(p1,p2);

        for (int i=0; i<howManyTimes; i++){
            int random = (int)(Math.random()*3);

            if(random==0){
                temp = findMidpoint(p1,temp);
            }else if (random==1){
                temp = findMidpoint(p2,temp);
            }else if (random==2){
                temp = findMidpoint(p3,temp);
            }

            StdDraw.point(temp.x,temp.y);
        }
    }

    public static void drawTriangle(int howManyTime){
        double length=1;
        double x1=0;
        double y1=0;
        double x2=length;
        double y2=0;
        double x3=length/2;
        double y3=Math.sqrt(3)*length/2;

        OrderedPair one = new OrderedPair(x1,y1);
        OrderedPair two = new OrderedPair(x2,y2);
        OrderedPair three = new OrderedPair(x3,y3);

        int hierarchy=0;

        for(int i=0; i<howManyTime; i++){
            OrderedPair One = findMidpoint(three,two);
            OrderedPair Two = findMidpoint(one,three);
            OrderedPair Three = findMidpoint(one,two);
            // line(One,Two);
            // line(One,Three);
            // line(Three,Two);

            line(three,One);
            line(two,One);
            line(one,Two);
            line(three,Two);
            line(two,Three);
            line(one,Three);

            one=One;
            two=Two;
            three=Three;
        }
    }
}
