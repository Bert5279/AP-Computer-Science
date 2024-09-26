/**
 * AP Computer Science
 *
 * BY 
 */
import java.util.Scanner;

public class Driver
{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        StringTool tool = new StringTool();
        String txt="1234567123";
        String txt2="abaaaab";

        System.out.println("Answer: "+tool.lastLetter(ask("Get the last letter of: ")));
        System.out.println("Answer: "+tool.formatPhoneNumber(ask("Format a Phone Number: ")));
        System.out.println("Answer: "+tool.middleThree(ask("Get the middle three of: ")));
        System.out.println("Answer: "+tool.swapLastTwo(ask("Swap the last two for: ")));
        System.out.println("Answer: "+tool.frontAgain(ask("Check the String: "), askNum("\nCheck how many digit: ")));

        input.close();
    }

    public static String ask(String q){
        Scanner input = new Scanner(System.in);
        System.out.print("\n"+q);
        String ans=input.nextLine();
        input.close();
        return ans;
    }
    
        public static int askNum(String q){
        Scanner input = new Scanner(System.in);
        System.out.print("\n"+q);
        int ans=input.nextInt();
        input.close();
        return ans;
    }
}
