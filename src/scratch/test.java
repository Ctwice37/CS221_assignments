package scratch;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void printCharsReverse(String str) {
        if (str == null || str.equals(""))

        return;

        printCharsReverse(str.substring(1));
        System.out.println(str.charAt(0));
    }

    public static void main (String [] args){


        printCharsReverse("String");
    }

}