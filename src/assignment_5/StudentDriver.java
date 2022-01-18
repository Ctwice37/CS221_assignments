package assignment_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDriver {

    public static class SortByScoreWithEquals implements Comparable<assignment_3.Student>{


        @Override
        public int compareTo(assignment_3.Student o) {
            if(this.equals(o))
                return 0;

        }
    }
    public static void main (String [] args){


        List<Student> arr = new ArrayList<>();

        arr.add(new Student(111, "Charles", 93));
        arr.add(new Student(112, "Sam", 95));
        arr.add(new Student(113, "Joe", 88));

        for(Student s : arr){
            System.out.println(s);
        }
        Collections.sort(arr);

        System.out.println("___________________________");
        for(Student s : arr){
            System.out.println(s);




    }
}
}
