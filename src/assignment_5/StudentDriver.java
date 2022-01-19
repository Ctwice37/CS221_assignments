package assignment_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentDriver {


    public static void main (String [] args){


        List<Student> arr = new ArrayList<>();



        arr.add(new Student(111, "Charles", 93));
        arr.add(new Student(112, "Sam", 95));
        arr.add(new Student(113, "Joe", 88));

        Iterator<Student> iter = arr.iterator();

        while (iter.hasNext()) {
            Student ss = iter.next();
            System.out.println(ss.toString());
        }

//        for(Student s : arr){
//            System.out.println(s);
//        }
//        Collections.sort(arr);
//
//        System.out.println("___________________________");
//        for(Student s : arr) {
//            System.out.println(s);
//        }

        Collections.sort(arr, new CompareUsingEquals());

        while (iter.hasNext()) {
            Student ss = iter.next();
            System.out.println(ss.toString());





    }
}}


