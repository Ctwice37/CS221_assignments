package scratch;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main (String [] args){
        List<String> list = new ArrayList<>();
        list.add("Zaineh");
        list.add("Yasmeen");
        list.add("John");
        list.set(2,"Moe");
        list.add(2,"Dave");
        list.remove(2);
        System.out.print(list);
    }
}

