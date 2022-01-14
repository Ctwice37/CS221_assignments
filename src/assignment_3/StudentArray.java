package assignment_3;

public class StudentArray {
    private Student[] a;
    private int nElems;



    public StudentArray(int max) {
        a = new Student[this.nElems = max];
    }

    public Student find(int id){
        Student student = null;
        for(int i = 0; i < a.length; i++){
            if(a[i].getId() == id)
                student = a[i];
        } return student;
    }

    public void insert(int id, String name, int mark){
        for(int i = 0; i <= a.length-1; i++){

            if(a[0] == null){
                a[0] = new Student(id, name, mark);
                break;
            }
            else if(i <= nElems && a[i] != null) {
                if (a[i].getId() == id){

                    break;}

            }

            else{
                a[i] = new Student(id, name, mark);
                break;}
            }



        }



    public boolean delete(int id){
        for(int i = 0; i < a.length-1; i++){
            if(a[i].getId() == id)
                for(int j = i + 1; j < a.length-1; j++){
                    a[i-1] = a[i];
                    return true;
                }
        }return false;
    }

    public void displayAll(){
        for(int i = 0; i < a.length-1; i++){
            if(a[i] != null)
               a[i].displayStudent();
        }


    }
}


