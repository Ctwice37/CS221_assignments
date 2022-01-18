package assignment_4;

public class singleLinkedList {

    private Node head = null;
    private int size;


    //static inner class
    public static class Node {
        private Integer data;
        private Node next = null;


        public Node(Integer data) {
            this.data = data;
        }

        public Node(Integer data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    //add node to the front
    private void add(Integer item) {
        Node temp = new Node(item, head);
        head = temp;
        size++;
    }


    private Integer size() {
        return size;
    }


    private boolean find(Integer item) {
        Node node = head;

        if (size == 0)
            return false;
        else
            for (Integer i = 0; i < size && node != null; i++) {
                if (node.data == item)
                    return true;
                else
                    node = node.next;
            }
        return false;
    }


    private Integer max() {
        Node node = head;
        int max = 0;

        if (size == 0)
            return -1;
        else
            for (Integer i = 0; i < size && node != null; i++) {
                if(node.data > max)
                    max = node.data;
                node = node.next;

            }return max;
    }

    private Integer min() {
        Node node = head;
        Integer min = 0;

        if (size == 0)
            return -1;
        else
            min = head.data;
            for (Integer i = 0; i < size && node != null; i++) {
                if(node.data < min)
                    min = node.data;
                node = node.next;

            }return min;
    }



    public static void main(String[] args){

        singleLinkedList s = new singleLinkedList();
        s.add(3);
        s.add(0);
        s.add(1);
        System.out.println(s.min());
}

    }

