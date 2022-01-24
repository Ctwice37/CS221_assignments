//package assignment_6;
//
//import java.util.Arrays;
//import java.util.EmptyStackException;
//
//public class StackArray<E> implements StackInterface<E> {
//
//    private E [] data;
//    private int top = -1;
//    private static final int INITIAL_CAPACITY = 10;
//    private int capacity;
//
//    public StackArray() {
//        data = (E[]) new Object[INITIAL_CAPACITY];
//        capacity = INITIAL_CAPACITY;
//    }
//
//    @Override
//    public E push(E obj) {
//        if(top == data.length - 1 ){
//            reallocate();
//        }
//        data[++top] = obj;
//        return obj;
//    }
//
//    @Override
//    public E peek() {
//        if(empty()){
//            throw new EmptyStackException();
//        }
//        return data[top];
//    }
//
//    @Override
//    public E pop() {
//        if(empty()){
//            throw new EmptyStackException();
//        }
//        return data[top--];
//    }
//
//    @Override
//    public boolean empty() {
//        return top == -1;
//    }
//
//    @Override
//    public int getSize() {
//        return top + 1;
//    }
//
//    public void reallocate(){
//        capacity = capacity * 2;
//        data = Arrays.copyOf(data, capacity);
//    }
//
//    public boolean balanced(E sequence) {
//        if (sequence.getClass().getSimpleName() != "String")
//            throw new IllegalArgumentException();
//        else {
//            String s = (String) sequence;
//
//            for (int i = 0; i < s.length(); i++) {
//                if (getSize() == capacity)
//                    reallocate();
//
//                if (top == -1 && String.valueOf(s.charAt(i)).equals("{" || "[" || "(")) {
//
//                        data[++top] = (E) String.valueOf(s.charAt(i));
//
//                    }
//
//
//            }
//            return true;
//        }
//
//    }
//
//}
//
