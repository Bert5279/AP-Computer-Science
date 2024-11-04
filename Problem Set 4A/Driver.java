/**
 * AP Computer Science
 *
 * BY 
 */
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args) {
        guessNumber();
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(0.5, 0.5);
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);
    }

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

 


    public static void triangle(double x, double y, double r){
        StdDraw.line(x,y+r,x+Math.sqrt(3)/2*r,y-0.5*r);
        StdDraw.line(x,y+r,x-Math.sqrt(3)/2*r,y-0.5*r);
        StdDraw.line(x-Math.sqrt(3)/2*r,y-0.5*r,x+Math.sqrt(3)/2*r,y-0.5*r);
    }
    
    
}
