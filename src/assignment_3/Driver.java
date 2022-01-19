package assignment_3;

import java.util.Iterator;

public class Driver {




    public static void main(String[] args){
        ArrayRandoms aa = new ArrayRandoms();



        aa.insert();
        aa.subList(45, 50);
        System.out.println(aa.size());

        for(Integer i : aa.arr){
            System.out.println(i);
        }



    }
}
