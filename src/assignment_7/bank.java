package assignment_7;
/*              Simulate the operation of a bank. Customers enter the bank, and there is one teller.
                If the teller is free, that teller serves the customer. Otherwise, the customer enters
                the queue and waits until the teller is free.

                Make your program take in a queue of customers and determine the average processing time for the teller.

                Optional:
                You make the teller finish with a customer by setting a timer that will count for 15 seconds
                (Assuming that he took 15 minutes). When the time is up, it should ask for the next customer and serve him/her.

                You can make the customers just names or create a Customer class. */
                import java.util.ArrayDeque;
                import java.util.ArrayList;
                import java.util.Queue;

public class bank {

    public static void main(String[] args) throws InterruptedException {

        Queue<employee> line = new ArrayDeque<>();


    line.add(new employee("Charles"));
    line.add(new employee("Feven"));
    line.add(new employee("Dean"));
    line.add(new employee("Ronnie"));

    while(!line.isEmpty()){
        Thread.sleep(15000);

        System.out.println(line.remove() + " was Served. Next in line, please");

    }






}

}
