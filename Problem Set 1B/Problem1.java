
/**
 * Write a description of class Problem1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("\nWelcome to the Celsius to Fahrenheit converter.");
        System.out.print("\nEnter a temperature in Celsius:");
        double celsius = input.nextDouble();
        double fahr = celsius*9/5+32;
        System.out.println("\nConvert to Fahrenheit: "+fahr);
        
        input.close();
    }
}
