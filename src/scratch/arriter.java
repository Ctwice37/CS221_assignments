package scratch;

public class arriter {


    public static int checkArr(int[] a) {



        Integer[] visited = new Integer[a.length];
        int index = 0;
        Integer value = null;


        while(value == null){

            if(index > a.length)
                value = 1;
            else if(a[index] ==-1)
                value = -1;
            else if(a[index] < -1)
                value = 1;
            else{
                if(visited[index] != null)
                    value = 0;
                else{
                    visited[index] = a[index];
                    index = a[index];
                }
            }
        }return value;

        }

    public static void main(String[] args) {

        int[] a1 = {4, 3, 2, 0,  1};
        System.out.println(checkArr(a1));


    }
}

