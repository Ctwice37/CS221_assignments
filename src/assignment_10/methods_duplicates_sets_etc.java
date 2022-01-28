package assignment_10;

import java.util.*;

public class methods_duplicates_sets_etc<E> {
    //**********___________________________________________________________________________________________________
    //Course Class__________________________________________________________________________________________________

    public static class Course {
        String cID;
        String CName;
        int creditHours;

        public String get_cID() {
            return cID;
        }

        public String getCName() {
            return CName;
        }

        public int getCreditHours() {
            return creditHours;
        }

        public Course(String cID, String CName, int creditHours) {
            this.cID = cID;
            this.CName = CName;
            this.creditHours = creditHours;


        }

        @Override
        public String toString() {
            return "Course{" +
                    "cID='" + cID + '\'' +
                    ", CName='" + CName + '\'' +
                    ", creditHours=" + creditHours +
                    '}';
        }
    }


    //**********____________________________________________________________________________________________________
    //Question 1____________________________________________________________________________________________________

    public List removeDuplicates(List<E> l){

        Set<E> set = new LinkedHashSet<>();
        List<E> temp = new ArrayList<>();

        set.addAll(l);

        for(E e : set)
            temp.add(e);

        return temp;
    }

    //**********____________________________________________________________________________________________________
    //Question 2____________________________________________________________________________________________________

    public int uniqueStrings(List<String> strings){

        Set<String> set = new LinkedHashSet<>(strings);

        return set.size();

    }
    //**********____________________________________________________________________________________________________
    //Question 3____________________________________________________________________________________________________

    public Map createMap(List<E> list_A, List<E> list_B){

        Map<E, E> newMap = new HashMap<>();
        int x = 0;

        if(list_A.size() < list_B.size())
            x = list_A.size();
        else
            x = list_B.size();

        for (int i = 0; i < x; i++) {
            newMap.put(list_A.get(i), list_B.get(i));
        }

        return newMap;

    }

    //**********_____________________________________________________________________________________________________
    //Question 4____________________________________________________________________________________________________

    public Map CreateCourseCatalog(List<Course> courses){

        Map<String, Course> courseCatalog = new HashMap<>();

        for(Course c : courses)
            courseCatalog.put(c.get_cID(), c);


        return courseCatalog;

    }


    //______________________________________________________________________________________________________________



    public static void main(String[] args) {
        methods_duplicates_sets_etc d = new methods_duplicates_sets_etc();

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(5);
        nums.add(5);

        for(int i: nums)
            System.out.println(i);

        System.out.println("___________________________________");

        System.out.println(d.removeDuplicates(nums));


        System.out.println("______________________________________");

        List<String> strings = new ArrayList<>();
        strings.add("Charles");
        strings.add("Charles");
        strings.add("Charles");
        strings.add("Sam");

        System.out.println(d.uniqueStrings(strings));


        System.out.println("___________________________________________________");


        Course c1 = new Course("CS221", "Data", 4);
        Course c2 = new Course("CS201", "Procedural", 4);
        Course c3 = new Course("CS203", "Data", 4);

        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);




        Map<String, Course> cc = d.CreateCourseCatalog(courses);


        System.out.println(cc.get("CS201"));






    }


}
