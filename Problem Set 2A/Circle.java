/**
 * AP Computer Science
 *
 * BY 
 */
public class Circle
{
    double radius;
    double circumference;
    double area;

    public Circle(){
        radius=1;
        circumference=Math.PI*radius*2;
        area=Math.pow(radius,2)*Math.PI;
    }

    public Circle(double r){
        radius =r;
        circumference=Math.PI*radius*2;
        area=Math.pow(radius,2)*Math.PI;
    }

    public double getRadius(){
        return radius;
    }

    public double getCircumference(){
        return circumference;
    }
    
    public double getArea(){
        return area;
    }
    
    public String toString(){
        return ("Hello, I am a circle with a radius of "+radius);
    }
}
