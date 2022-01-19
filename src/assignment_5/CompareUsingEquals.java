package assignment_5;

import java.util.Comparator;

public class CompareUsingEquals implements Comparator<Student> {



    @Override
    public int compare(Student o1, Student o2) {
        Integer score1 = o1.score;
        Integer score2 = o2.score;

        if(score1.compareTo(score2) < 0)
            return -1;
        else if(score1.compareTo(score2)> 0)
            return 1;
        else
            return 0;
    }
}
