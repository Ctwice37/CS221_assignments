package assignment_3;

public class StudentDriver {

    public static void main(String[] args){

            StudentArray ar = new StudentArray(3);

            Student s1 = new Student(111, "Charles", 98);
            Student s2 = new Student(112, "Sam", 98);
            Student s3 = new Student(113, "Emmie", 98);

            ar.insert(111, "Charles", 98);
            ar.insert(112, "Sam", 99);
            ar.insert(113, "Sam", 99);
            ar.displayAll();

    }
}
