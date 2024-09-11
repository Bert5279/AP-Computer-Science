
/**
 * Write a description of class Problem5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Problem5
{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to Sum of Digits calculator");
        System.out.print("\nEnter a 3 digit integer:");
        int number = (int)Math.abs(input.nextDouble());
        int d1=number%10;
        int d2=number%100/10;
        int d3=number/100;

        System.out.println("\nThe sum of all digit of "+number+" is "+(d1+d2+d3));

        input.close();
    }
}
