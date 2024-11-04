/**
 * AP Computer Science
 *
 * BY 
 */
public class Question2_Drawing
{
    public static void drawGrid(int row){
        double w=1.0/row;
        StdDraw.setPenRadius(0.3/row);
        StdDraw.setPenColor(StdDraw.BLACK);
        for(int i=0; i<=row; i++){
            StdDraw.line(w*i, 0, w*i, 1);
            StdDraw.line(0,w*i,1, w*i);
        }
    }

    public static void drawCurve(int row){
        double w=1.0/row;
        StdDraw.setPenRadius(0.2/row);
        StdDraw.setPenColor(StdDraw.BLACK);
        for(int i=0; i<=row; i++){
            StdDraw.line(w*i, 0, 1, w*i);
            StdDraw.line(0, w*i, w*i, 1);
        } 
    }

    public static void drawCircle(int num){
        double w=1.0/num;
        StdDraw.setPenRadius(0.2/num);
        StdDraw.setPenColor(StdDraw.BLACK);
        for(int i=0; i<=num; i++){
            StdDraw.circle(0.5,0.5,w*i);
        }         
    }
}
