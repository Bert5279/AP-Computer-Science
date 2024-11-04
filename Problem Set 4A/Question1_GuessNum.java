/**
 * AP Computer Science
 *
 * BY 
 */
import java.util.Scanner;

public class Question1_GuessNum
{
        public static void guessNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        int num = (int)(Math.random()*101);
        int guess = -1;
        int tries=0;
        while(num!=guess){
            System.out.print("\nYour guess: ");
            guess = input.nextInt();
            tries++;
            if(num==guess){
                System.out.println("You guessed it! It took you "+tries+" tries.");
            } else if(num<guess){
                System.out.println("Nope, that guess is too high."); 
            } else if(num>guess){
                System.out.println("Nope, that guess is too low.");
            }
        }

        input.close();

    }
}
