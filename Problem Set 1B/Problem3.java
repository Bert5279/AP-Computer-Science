
/**
 * Write a description of class Problem3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Problem3
{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to Days to weeks and days converter");
        System.out.print("\nEnter number of days in total:");
        double totalDays = input.nextDouble();
        int weeks = (int)totalDays/7;
        double days = totalDays-7*weeks;

        // double bmi=mass/(Math.pow(height,2));
        System.out.println("\nThere are "+weeks+" weeks and "+days+" days in "+totalDays+" days");

        input.close();
    }
}
