package assignment_3;
import java.lang.Math.*;
import java.util.Arrays;


public class ArrayRandoms {

    public static Integer[] arr;

    public void insert(){
        arr = new Integer[50];
        for(int i = 0; i < arr.length; i++) {
           arr[i] = (int)(Math.random() * ((0 - -100) + 1)) + -100;
        }
    }


    //arr = Arrays.copyOf(arr, arr.length - 1);
    public void removeDuplicates() {

        Integer[] temp = new Integer[arr.length];

        int num = 0;
        int index = 0;
        int trim = 0;
        for (int i = 0; i < arr.length; i++){
            num = arr[i];

            if(temp[0] == null) {
                temp[0] = num;
                index++;
                trim++;
            }else{

                for(int j = 0; j < temp.length; j++){
                    if(temp[j] == num)
                        break;
                    else if(temp[j] == null){
                        temp[j] = num;
                        index++;
                        trim++;
                    }
                }
            }


        }arr = Arrays.copyOf(temp, arr.length - trim);

    }

    public void clear() {
        arr = new Integer[arr.length];
    }

    public int size(){
        int size = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null)
                size++;
        }return size;
    }


    public int get(int index){
        if(index < 0 || index >= size())
            throw new ArrayIndexOutOfBoundsException();
        return arr[index];
    }

    public Integer[] subList(int start, int end){
        if (start < 0 || start > size() || end < 0 || end >size())
            throw new ArrayIndexOutOfBoundsException();

        Integer[] temp = new Integer[end - start];
        int index = 0;
        for(int i = start; i < end; i++){
            temp[index] = arr[i];
            index++;}
        arr = Arrays.copyOf(temp, end - start);
         return arr;
    }

    public int set(int index, int newValue){
        if (index < 0 || index >=arr.length)
            throw new ArrayIndexOutOfBoundsException();
        arr[index] = newValue;


        return newValue;
    }

}
