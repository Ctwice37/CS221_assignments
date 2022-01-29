package assignment_7;

import java.util.LinkedList;
import java.util.Queue;

public class Bank {



    public static void main(String[] args) {

        Queue<Customer> line = new LinkedList<>();

        Customer c1 = new Customer("Charles");
        Customer c2 = new Customer("Feven");
        Customer c3 = new Customer("Sam");
        Customer c4 = new Customer("Dean");

        line.offer(c1);
        line.offer(c2);
        line.offer(c3);
        line.offer(c4);






    }

}
