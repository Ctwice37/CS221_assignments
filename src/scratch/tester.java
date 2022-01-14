package scratch;


import java.util.Arrays;

public class tester {

    static int[] arr = {5, 4, 3, 1, 2};

    public static void quizRemove(int index) {

        for (int i = index + 1; i < arr.length; i++) {
            arr[i -1] = arr[i];
        }arr = Arrays.copyOf(arr, arr.length - 1);
    }
    public static void main (String[]args){
        tester.quizRemove(2);
        for(int s : arr)
            System.out.print("|" + s);
    }
}