package assignment_5;

import java.util.Iterator;

public class Student implements Comparable<Student>{

    int sid;
    String sName;
    int score;

    public Student(int sid, String sName, int score) {
        this.sid = sid;
        this.sName = sName;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if (this.score < o.score)
            return -1;
        else if (this.score > o.score)
            return 1;
        else return 0;

    }

    @Override
    public boolean equals(Object obj) {
        Student stud = (Student) obj;
        if (this.score == stud.score)
            return true;
        return false;

    }

    @Override
    public String toString() {
        return "[" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", score=" + score +
                ']';
    }

}