package scratch;

public class arrayTEST {


    public static void main(String[] args) {


        int[] arr = {1, 2, 2};


        int[] temp = new int[arr.length];
        int pos = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[pos++] = arr[i];
            }
        }
        arr = temp;

        for(int l : arr)
             System.out.print("|" + l);

    }



}