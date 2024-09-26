/**
 * AP Computer Science
 *
 * BY 
 */
public class StringTool
{

    String text;

    public StringTool(){

    }

    public StringTool(String txt){
        text=txt;
        if(txt==null){
            txt="no content";
        }
    }

    public String lastLetter(){
        return text.substring(text.length()-1);
    }

    public String lastLetter(String txt){
        return txt.substring(txt.length()-1);
    }

    public String formatPhoneNumber(String txt){
        return ("("+txt.substring(0,3)+") "+txt.substring(3,6)+"-"+txt.substring(6,10));
    }

    public String middleThree(String txt){
        int middle=txt.length()/2;
        return (txt.substring(middle-1,middle+2));
    }
    
    public String swapLastTwo(String txt){
        String one = txt.substring(txt.length()-1);
        String two = txt.substring(txt.length()-2,txt.length()-1);
        return (txt.substring(0,txt.length()-2)+one+two);
    }
    
    public boolean frontAgain(String txt, int n){
        return txt.substring(0,n).equals(txt.substring(txt.length()-n));
    }
}
