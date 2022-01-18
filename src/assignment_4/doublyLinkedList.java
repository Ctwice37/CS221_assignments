package assignment_4;

public class doublyLinkedList<E> {


        // Data members
       private Node<E> head;
        private int size = 0;

        private static class Node<E> {

            // Data fields
            private E data;
            private Node<E> next;
            private Node<E> previous;

            private Node(E item) {
                this.data = item;
                this.next = null;
                this.previous = null;
            }
        }

        private void addFirst(E item){
            Node<E> node = head;
            if(size == 0) {
                head = new Node<E>(item);
                size++;
            } else {
                head = new Node<E>(item);
                head.next = node;
                size++;
            }
        }

        private void addAfter(Node<E> node, E item){





        }


        }





