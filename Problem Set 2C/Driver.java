/**
 * AP Computer Science
 *
 * BY 
 */

import java.util.*;

public class Driver
{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        OrderedPair A=new OrderedPair(2,5);
        OrderedPair B=new OrderedPair(4,10);
        Formula Math=new Formula();

        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c:");
        double a=askNum("a: ");
        double b=askNum("b: ");
        double c=askNum("c: ");
        System.out.println("The solutions for "+a+"x^2+"+b+"x+"+c+" are "+Math.findQuadraticRoots(a,b,c) );

        System.out.println("\nSLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");
        double x1=askNum("x1: ");
        double y1=askNum("y1: ");
        double x2=askNum("x2: ");
        double y2=askNum("y2: ");
        System.out.println("A line between "+new OrderedPair(x1,y1)+" and "+new OrderedPair(x2,y2)+" has a slope of "+Math.findSlope(new OrderedPair(x1,y1),new OrderedPair(x2,y2)));

        System.out.println("\nMIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        double x3=askNum("x1: ");
        double y3=askNum("y1: ");
        double x4=askNum("x2: ");
        double y4=askNum("y2: ");
        System.out.println("A midpoint between "+new OrderedPair(x3,y3)+" and "+new OrderedPair(x4,y4)+" is "+Math.findMidpoint(new OrderedPair(x3,y3),new OrderedPair(x4,y4)));

        System.out.println("\nSUM OF AN ARITHMETIC SERIES");
        double a1=askNum("Numbers of terms: ");
        double d1=askNum("Start with: ");
        double k1=askNum("Increases by: ");
        System.out.println("The sum of the first "+a1+" terms of a finit geometric series that starts with "+d1+" and increases by "+k1+" is "+Math.findArithmetricSeriesSum(d1,k1,a1));

        System.out.println("\nSUM OF AN ARITHMETIC SERIES");
        double a2=askNum("Numbers of terms: ");
        double d2=askNum("Start with: ");
        double k2=askNum("Rate of growth: ");
        System.out.println("The sum of the first "+a2+" terms of a finit geometric series that starts with "+d2+" and increases by a rate of "+k2+" is "+Math.findGeometricSeriesSum(d2,k2,a2));

        System.out.println("\nDIE ROLLER");
        int sides=(int)askNum("How many sides does your die have: ");
        System.out.println("Rolling a "+sides+" sided die, you get "+Math.rollDie(sides));
        input.close();
    }

    public static String ask(String q){
        Scanner input = new Scanner(System.in);
        System.out.print(q);
        String ans=input.nextLine();
        input.close();
        return ans;
    }

    public static double askNum(String q){
        Scanner input = new Scanner(System.in);
        System.out.print(q);
        double ans=input.nextDouble();
        input.close();
        return ans;
    }
}
