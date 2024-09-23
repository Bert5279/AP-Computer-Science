/**
 * AP Computer Science
 *
 * BY 
 */
import java.util.Scanner;

public class Main
{
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in); 
        Circle circle1;
        System.out.print("Create a circle\nEnter the radius of the circle: ");
        double r1=input.nextDouble();
        circle1= new Circle(r1);

        System.out.println(circle1);
        System.out.println("\ngetRadius()--> "+circle1.getRadius());
        System.out.println("getCircumferenct()--> "+circle1.getCircumference());
        System.out.println("getArea()-->"+circle1.getArea());

        System.out.println("\n----------");

        System.out.print("\nCreate a Cylinder\nEnter the radius of the base: ");
        double r2=input.nextDouble();
        System.out.print("Enter the height: ");
        double h2=input.nextDouble();
        Cylinder cylinder2;
        cylinder2= new Cylinder(r2,h2);

        System.out.println(cylinder2);
        System.out.println("\ngetRadius()--> "+cylinder2.getRadius());
        System.out.println("getHeight()--> "+cylinder2.getHeight());
        System.out.println("getSurfaceArea()-->"+cylinder2.getSurfaceArea());
        System.out.println("getVolume()-->"+cylinder2.getVolume());

    }
}
