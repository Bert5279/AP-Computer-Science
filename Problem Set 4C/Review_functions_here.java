import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review_functions_here {

    private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
    private static ArrayList<String> posAdjectives = new ArrayList<String>();
    private static ArrayList<String> negAdjectives = new ArrayList<String>();

    private static final String SPACE = " ";
    static{
        try {
            Scanner input = new Scanner(new File("cleanSentiment.csv"));
            while(input.hasNextLine()){
                String[] temp = input.nextLine().split(",");
                sentiment.put(temp[0],Double.parseDouble(temp[1]));
                //System.out.println("added "+ temp[0]+", "+temp[1]);
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing cleanSentiment.csv");
        }

        //read in the positive adjectives in postiveAdjectives.txt
        try {
            Scanner input = new Scanner(new File("positiveAdjectives.txt"));
            while(input.hasNextLine()){
                String temp = input.nextLine().trim();
                System.out.println(temp);
                posAdjectives.add(temp);
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
        }   

        //read in the negative adjectives in negativeAdjectives.txt
        try {
            Scanner input = new Scanner(new File("negativeAdjectives.txt"));
            while(input.hasNextLine()){
                negAdjectives.add(input.nextLine().trim());
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing negativeAdjectives.txt");
        }   
    }

    /** 
     * returns a string containing all of the text in fileName (including punctuation), 
     * with words separated by a single space 
     */
    public static String textToString( String fileName )
    {  
        String temp = "";
        try {
            Scanner input = new Scanner(new File(fileName));

            //add 'words' in the file to the string, separated by a single space
            while(input.hasNext()){
                temp = temp + input.next() + " ";
            }
            input.close();

        }
        catch(Exception e){
            System.out.println("Unable to locate " + fileName);
        }
        //make sure to remove any additional space that may have been added at the end of the string.
        return temp.trim();
    }

    public static String fakeReview(String fileName ){
        String text=textToString(fileName);
        String temp="";
        int star = text.indexOf("*");
        int space=text.indexOf(SPACE);
        String word="";
        String keyword="";
        double score=0;

        while(text.indexOf("*")!=-1){

            // word=removePunctuation(word);
            if(star>=0){
                word=text.substring(0,star);
                temp+=word;
                text=text.substring(star+1);

                space=text.indexOf(SPACE);
                if(space>=0){
                    keyword=text.substring(0,space);
                    keyword=removePunctuation(keyword);
                } else {
                    keyword=text.substring(0);
                    keyword=removePunctuation(keyword);
                }
                score=sentimentVal(keyword);
                if(score>0){
                    String neg=negAdjectives.get((int)(Math.random()*negAdjectives.size()+1));
                    temp+=neg+" "+neg+" "+neg+" ";
                    text=text.substring(keyword.length());
                } else if(score<0){
                    String pos=posAdjectives.get((int)(Math.random()*posAdjectives.size()+1));
                    temp+=pos+" "+pos+" "+pos+" ";
                    text=text.substring(keyword.length());
                } else {
                    temp+=keyword;
                    text=text.substring(keyword.length());
                }
            }

        }
        temp+=text.substring(space);
        System.out.println(temp);
        return temp;
    }

    public static int starRating(String fileName){
        double score = totalSentiment(fileName);
        int numWord = numWord(fileName);
        double scale=numWord*0.25;
        if(score>=scale*4){
            return 5;
        } else if(score>=scale*3){
            return 4;
        } else if(score>=scale*2){
            return 3;
        } else if(score>=scale){
            return 2;
        } else if(score>=0){
            return 1;
        }
        return -1;
    }

    public static int numWord(String fileName){
        String text=textToString(fileName);
        int temp=0;

        while(text.indexOf(" ")!=-1){
            int space = text.indexOf(" ");
            String word=text.substring(0,space);
            word=removePunctuation(word);
            if(space>=0){
                text=text.substring(space+1);
            }
            if(sentimentVal(word)!=0){
                temp++;
            };
        }

        return temp; 
    }

    public static double totalSentiment( String fileName ){
        String text=textToString(fileName);
        double temp=0;

        while(text.indexOf(" ")!=-1){
            int space = text.indexOf(" ");
            String word=text.substring(0,space);
            word=removePunctuation(word);
            if(space>=0){
                text=text.substring(space+1);
            }
            temp+=sentimentVal(word);
        }

        return temp;    
    }

    /**
     * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
     */
    public static double sentimentVal( String word )
    {
        try
        {
            return sentiment.get(word.toLowerCase());
        }
        catch(Exception e)
        {
            return 0;
        }
    }

    /**
     * Returns the ending punctuation of a string, or the empty string if there is none 
     */
    public static String getPunctuation( String word )
    { 
        String punc = "";
        for(int i=word.length()-1; i >= 0; i--){
            if(!Character.isLetterOrDigit(word.charAt(i))){
                punc = punc + word.charAt(i);
            } else {
                return punc;
            }
        }
        return punc;
    }

    /**
     * Returns the word after removing any beginning or ending punctuation
     */
    public static String removePunctuation( String word )
    {
        while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
        {
            word = word.substring(1);
        }
        while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
        {
            word = word.substring(0, word.length()-1);
        }

        return word;
    }

    /** 
     * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
     */
    public static String randomPositiveAdj()
    {
        int index = (int)(Math.random() * posAdjectives.size());
        return posAdjectives.get(index);
    }

    /** 
     * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
     */
    public static String randomNegativeAdj()
    {
        int index = (int)(Math.random() * negAdjectives.size());
        return negAdjectives.get(index);

    }

    /** 
     * Randomly picks a positive or negative adjective and returns it.
     */
    public static String randomAdjective()
    {
        boolean positive = Math.random() < .5;
        if(positive){
            return randomPositiveAdj();
        } else {
            return randomNegativeAdj();
        }
    }
}