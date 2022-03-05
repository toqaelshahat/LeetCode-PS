import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args){
        System.out.println("The sum is"+romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {

        Map<Character, Integer> romans = new HashMap<Character, Integer>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
        Integer sum=romans.get(s.charAt(0));
        for(int i =0; i < s.length()-1 ; i++){
           if (romans.containsKey(s.charAt(i))==true ){
               if(romans.get(s.charAt(i))>= romans.get(s.charAt(i+1))){
                   sum = sum + romans.get(s.charAt(i+1));
               }
               else if(romans.get(s.charAt(i))< romans.get(s.charAt(i+1))){
                   sum = sum - romans.get(s.charAt(i));
                   sum = sum - romans.get(s.charAt(i))+romans.get(s.charAt(i+1));

               }

            }
        }


        return sum;

    }
}
