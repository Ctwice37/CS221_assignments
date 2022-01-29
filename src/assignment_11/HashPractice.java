package assignment_11;



/*Create a method that uses a HashMap to store the frequency counts for all
the words in a text document (given string paragraph). When you are done,
display the contents of this HashMap. */


import java.util.HashMap;
import java.util.Map;

public class HashPractice {


    public static Map frequencyCount(String par) {

        Map<String, Integer> count = new HashMap<>();

        par = par.replaceAll("\\p{Punct}", "");
        String[] words = par.split(" ");

        Integer x = 1;


        for (String ss : words) {
            if (count.containsKey(ss)) {
                int y = count.get(ss);
                count.replace(ss, ++y);
            } else
                count.put(ss, x);



        } return count;

    }







    public static void main(String[] args) {

        String s = "This is a sentence with many similar words. I need similar words to make sure " +
                "my method has a sentence with as many similar words so that the words will add up." +
                " The more words that are similar the more the words will add up. I hope my method detects" +
                " all the similar words in this sentence with many similar words";


        System.out.println(frequencyCount(s));
    }


}
