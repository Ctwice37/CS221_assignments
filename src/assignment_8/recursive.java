package assignment_8;

/*1. Write a recursive method to convert from decimal to Binary.

2. Write a recursive method to count the number of vowels in a given string.

3. Write a recursive method to find a character in a string.

*/

public class recursive {


    public static int findChar(String s, char c){
        //return index of character if found, else returns -1



        if(s.length()==0)
            return 1;
        else{
            if(String.valueOf(s.charAt(0)).equals(String.valueOf(c)))
                return 1 + findChar(s.substring(1), c);
            else
                return findChar(s.substring(1), c);


        }


    }


    public static int countVowels(String s) {

        String vowels = "aeiou";


        if (s.length() == 0)
            return 0;
        else {
            for (int j = 0; j < s.length(); j++) {
                for (int i = 0; i < vowels.length(); i++) {


                    if (String.valueOf(vowels.charAt(i)).equalsIgnoreCase(String.valueOf(s.charAt(j)))) {
                        return 1 + countVowels(s.substring(1));

                    } else {
                        return 0 + countVowels(s.substring(1));

                    }

                }
            }
        }return 0;

    }


    public 




    public static void main(String[] args){
        System.out.println(findChar("String", 'r'));
    }

}




