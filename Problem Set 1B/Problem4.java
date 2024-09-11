
/**
 * Write a description of class Problem4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Problem4
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to Price Calculator");
        System.out.print("\nEnter the price of one item:");
        double price = input.nextDouble();

        System.out.print("\nEnter the quantity of the item:");
        double num=input.nextDouble();
        System.out.print("\nEnter the tax rate in percentage:");
        double rate = input.nextDouble();

        double total=price*num*(1+rate/100);
        System.out.println("\nYou will need a total of "+total+" dollar");

        input.close();
    }
}
