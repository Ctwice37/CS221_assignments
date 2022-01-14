//package scratch;
//
//import java.util.Arrays;
//
//public class duplicatesTest {
//
//    public static void removeDuplicates(Integer[] arr) {
//
//        Integer[] temp = new Integer[arr.length];
//
//        int num = 0;
//        int index = 0;
//        int trim = 0;
//        for (int i = 0; i < arr.length; i++){
//            num = arr[i];
//
//            if(temp[0] == null) {
//                temp[0] = num;
//                index++;
//                trim++;
//            }else{
//
//                for(int j = 0; j < temp.length; j++){
//                    if(temp[j] == num)
//                        break;
//                    else if(temp[j] == null){
//                        temp[j] = num;
//                        index++;
//                        trim++;
//                    }
//                }
//            }
//
//
//        }arr = Arrays.copyOf(temp, arr.length - trim);
//
//    }
//
//    public static void main(String[] args) {
//        Integer[] arr = {1,3,4,5,2,4};
//        for(int i : arr){
//            System.out.println(i);
//        }
//
//        removeDuplicates(arr);
//
//        for(int i : arr){
//            System.out.println(i);
//        }
//
//
//    }
//}
