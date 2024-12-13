/**
 * AP Computer Science
 *
 * BY 
 */
import java.util.*;
public class GAME_OoO
{
    public static String[][] board;
    public static String name1,name2;
    public static int round=1;
    public static String curr;
    public static int mode=0;
    public static int winN=5;
    public static boolean win=false;

    public static void main (String[] args) {
        board = new String[16][16];
        for(int r=0; r<board.length; r++){
            for(int c=0; c<board[0].length; c++){
                board[r][c]=" "; 
            }
        }

        askPlayerName();
        mode=1;

        if(mode==1){
            game();
        } 
    }

    public static void game(){
        printBoard();  

        while(win==false){
            System.out.println("Round "+round+" starts");
            System.out.println("Player 1: "+name1);
            System.out.println("Player 2: "+name2);
            if(round%2==1){
                curr=name1;
            } else if(round%2==0){
                curr=name2;
            }

            placeChess(curr);
            win=win();
            printBoard(); 
        }
        System.out.println(curr+" wins the game!!!");

    }

    public static void placeChess(String txt){

        String ans=askString(txt+", make your move (row,columm)");
        while(ans.indexOf(",")<1&&ans.substring(ans.indexOf(",")+1).length()>=1){
            ans=askString("Wrong syntax, try again");
        }

        int row=Integer.parseInt(ans.substring(0,ans.indexOf(",")));
        int col=Integer.parseInt(ans.substring(ans.indexOf(",")+1));
        while(!board[row][col].equals(" ")&&row>=board.length&&col>=board[0].length){
            ans=askString("Invalid location, try again");
        }

        if(!board[row][col].equals(" ")&&row<board.length&&col<board[0].length){
            System.out.println(board[row][col]+" is already here.");
        } else {
            board[row][col]=txt;
            round++;
        }
        printBoard();
    }

    public static String askString(String que){
        Scanner input = new Scanner(System.in);
        System.out.print(que+" : ");
        return input.nextLine();
    }

    public static void printBoard(){
        System.out.print("\n  ");
        for(int c=0; c<board[0].length; c++){
            System.out.print("  "+c+"  ");
        }
        System.out.println();
        for(int r=0; r<board.length; r++){
            System.out.print(r+" ");
            for(int c=0; c<board[0].length; c++){
                System.out.print(" ["+board[r][c]+"] ");
            }
            System.out.println("\n");
        }
        System.out.println();
    }

    public static boolean win(){
        for(int r=0; r<board.length-winN+1; r++){
            for(int c=0; c<board[0].length-winN+1; c++){
                String temp=board[r][c];
                if(!temp.equals(" ")&&temp.equals(board[r][c+1])&&temp.equals(board[r][c+2])&&temp.equals(board[r][c+3])&&temp.equals(board[r][c+4])){
                    return true;
                }
                if(!temp.equals(" ")&&temp.equals(board[r+1][c])&&temp.equals(board[r+2][c])&&temp.equals(board[r+3][c])&&temp.equals(board[r+4][c])){
                    return true;
                }
                if(!temp.equals(" ")&&temp.equals(board[r+1][c+1])&&temp.equals(board[r+2][c+2])&&temp.equals(board[r+3][c+3])&&temp.equals(board[r+4][c+4])){
                    return true;
                }
            }
        }
        // -------
        for(int r=board.length-winN+1; r<board.length; r++){
            for(int c=0; c<board[0].length-winN+1; c++){
                String temp=board[r][c];
                if(!temp.equals(" ")&&temp.equals(board[r][c+1])&&temp.equals(board[r][c+2])&&temp.equals(board[r][c+3])&&temp.equals(board[r][c+4])){
                    return true;
                }
            }
        }
        //    |||||
        for(int r=0; r<board.length-winN+1; r++){
            for(int c=board[0].length-winN+1; c<board[0].length; c++){
                String temp=board[r][c];
                if(!temp.equals(" ")&&temp.equals(board[r+1][c])&&temp.equals(board[r+2][c])&&temp.equals(board[r+3][c])&&temp.equals(board[r+4][c])){
                    return true;
                }

            }
        }
        //   /////
        for(int r=board.length-1; r>winN-1; r--){
            for(int c=0; c<board[0].length-winN; c++){
                String temp=board[r][c];
                if(!temp.equals(" ")&&temp.equals(board[r+1][c-1])&&temp.equals(board[r+2][c-2])&&temp.equals(board[r+3][c-3])&&temp.equals(board[r+4][c-4])){
                    return true;
                }
            }
        }
        return false;

    }

    public static void askPlayerName(){
        name1=askString("Hello, Player 1! Choose a symbol");
        while(name1.length()==0){
            name1=askString("Invalid name, try again");
        }
        name1=name1.substring(0,1);
        name2=askString("Hello, Player 2! Choose a symbol");
        while(name2.length()==0||name2.equals(name1)){
            name2=askString("Invalid name, try again");
        }

        name2=name2.substring(0,1);
    }
}