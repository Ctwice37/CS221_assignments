package assignment_8;

/*1. Write a recursive method to convert from decimal to Binary.

2. Write a recursive method to count the number of vowels in a given string.

3. Write a recursive method to find a character in a string.

*/

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class recursive {


    public static boolean findChar(String s, char c){
        //return true if character is found, else returns false
        if(s.length() == 0)
            return false;
        else{
            if(String.valueOf(s.charAt(0)).equals(String.valueOf(c)))
                return true;
            else
                return findChar(s.substring(1), c);


        }


    }


    public static int countVowels(String s) {
       // String vowels = "aeiou";
        String regex = ("[a||e||i||o||u]");
        Pattern compile = Pattern.compile("[aeiou]");
        Matcher matcher = compile.matcher(null);

        //ArrayList<String> str = {"a", "e", "i", "o", "u"};



        if (s.length() == 0)
            return 0;
        else {
                //for (int i = 0; i < vowels.length(); i++) {
                    if (regex.equalsIgnoreCase(String.valueOf(s.charAt(0)))) {

                        return 1 + countVowels(s.substring(1));
                    } else {
                        return countVowels(s.substring(1));
                    }
                }

            }
   // }




    public static String decToBinary(int binary){
        StringBuilder ss = new StringBuilder();

        if(binary % 2 == 0 && binary/2 == 0)
            return String.valueOf(ss);
        else{
            if(binary % 2 == 0 || binary / 2 == 0)
                return ss + "1" + decToBinary(binary/2);

            else
                return ss + "0" + decToBinary(binary/2);
        }

    }
    public static void main(String[] args){
        System.out.println(countVowels("String"));
    }

}




