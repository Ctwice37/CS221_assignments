package assignment_3;

public class Student {

    private int id;
    private String name;
    private int mark;

    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public void displayStudent() {
        System.out.println("id: " + id + " name: " + name + " mark: " + mark);

    }

    public int getId(){
        return id;
    }
}

