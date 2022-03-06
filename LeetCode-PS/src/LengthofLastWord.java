import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class  LengthofLastWord {
    /*Given a string s consisting of some \
    words separated by some number of spaces,
     return the length of the last word in
     the string.*/
    public static void main(String[] args) throws FileNotFoundException {
        String ss = "en momk hyppp ";
        System.out.println(lengthOfLastWord(ss));


    }
    public static int lengthOfLastWord(String s) {
        int c =0;
       for(int i= s.length()-1 ; i >=0; i--){
           if(s.charAt(i)==' '&& c>0){
               return c;
           }
           else if(s.charAt(i)!=' '){
               c++;

           }

       }
       return c;

    }

}
