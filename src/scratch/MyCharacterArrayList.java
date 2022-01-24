//package scratch;
//
//import java.util.Arrays;
//import java.util.Iterator;
//
//public class MyCharacterArrayList implements Iterable {
//
//    public static void main(String[] args){
//        MyCharacterArrayList n = new MyCharacterArrayList();
//        n.add('c');
//        n.add('h');
//        n.add('a');
//        n.add('l');
//        n.add('e');
//        n.add('s');
//        n.insert(3, 'r');
//        System.out.println(n);
//
//    }
//
//
//    private char[] arr;
//    private int size;
//    private int capacity;
//    private static final int INITIAL_CAPACITY = 10;
//
//    public MyCharacterArrayList() {
//        arr = new char[INITIAL_CAPACITY];
//        capacity = INITIAL_CAPACITY;
//    }
//
//    private void reallocate() {
//        capacity = capacity *2;
//        arr = Arrays.copyOf(arr, capacity);
//    }
//
//    public void insert(int index, Character c){
//        if(index < 0 || index >= size)
//            throw new ArrayIndexOutOfBoundsException();
//        if(size == capacity)
//            reallocate();
//        for(int i = size; i > index; i--){
//            arr[i] = arr[i -1];
//        }
//        size++;
//        arr[index] = c;
//    }
//    public void add(Character item){
//        // What is the size exceeds the capacity?
//        if(size == capacity){
//            reallocate();
//        }
//        arr[size] = item;
//        size++;
//    }
//    public String toString(){
//        StringBuilder sb = new StringBuilder("[");
//        for(int i = 0; i < size-1; ++i){
//            sb.append(arr[i]+", ");
//        }
//        sb.append(arr[size-1]+"]");
//        return sb.toString();
//    }
//
//
//}
