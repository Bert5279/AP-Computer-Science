/**
 * AP Computer Science
 *
 * BY 
 */
public class Cylinder
{
    Circle base;
    double height,radius,area,circumference;

    public Cylinder(){
        base = new Circle(1);  
        height=1;
    }

    public Cylinder(double b, double h){
        base= new Circle(b);
        height=h;
        area=base.getArea();
    }

    public double getRadius(){
        return base.getRadius();
    }

    public double getHeight(){
        return height;
    }

    public double getSurfaceArea(){
        return base.getArea()*2+base.getCircumference()*height;
    }

    public double getVolume(){
        return base.getArea()* height;
    }
    
    public String toString(){
        return ("Hello I am a cylinder with a radius of "+getRadius()+" and height of "+getHeight());
    }
}
