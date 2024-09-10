
/**
 * Write a description of class mainTab here.
 *
 * @Bert (your name)
 * 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Question2
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        // String name;
        // System.out.println("Hello World!");

        System.out.print("\nEnter Your Name:  ");
        String name = input.nextLine();
        System.out.println("\nHello " + name + "!");

        System.out.print("\nWhat is your favourite course at school?\n - ");
        String answer1 = input.nextLine();

        System.out.print("\nWhat is your favourite show?\n - ");
        String answer2 = input.nextLine();

        System.out.print("\nHow many hours do you spend studying each day?\n - ");
        int answer3 = input.nextInt();
        checkReasonable(answer3);

        System.out.print("\nHow many hours do you spend watching shows each day?\n - ");
        int answer4 = input.nextInt();
        checkReasonable(answer4);

        System.out.println("\nYou spend "+answer3+" hours studying each day");
        System.out.println("You spend "+answer4+" hours studying each day");
        System.out.println("In total, you spend "+(answer3+answer4)+" hours studying and watching shows each day");
        // System.out.print("A");
        // System.out.println("B");
        // System.out.println("C");
        // System.out.print("D");

        input.close();
    }

    public static void checkReasonable(double num){
        if(num>=24){
            Scanner input = new Scanner(System.in);
            System.out.print("You sure?\n - ");   
            String temp=input.nextLine();
            System.out.println("OK\n");
            input.close();
        }
    }
}

