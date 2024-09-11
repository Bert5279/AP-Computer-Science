
/**
 * Write a description of class Problem2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Problem2
{
    // import java.util.Scanner;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to the Body Mass Index (BMI) converter");
        System.out.print("\nEnter your weight in kilogram(kg):");
        double mass = input.nextDouble();
        System.out.print("\nEnter your height in meter(m):");
        double height = input.nextDouble();
        
        double bmi=mass/(Math.pow(height,2));
        System.out.println("\nYour Body Mass Index: "+bmi);

        input.close();
    }
}
