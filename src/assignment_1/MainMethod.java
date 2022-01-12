package assignment_1;

public class MainMethod {

    public static void main(String[] args){

        Customer[] customerArray = new Customer[3];


        Address aBilling = new billingAddress("222", "Fairfield", "IA", "52556");
        Address aShipping = new shippingAddress("222", "Fairfield", "IA", "52556");

        Customer a1 = new Customer("Charles", "Carpenter", "12431232", aBilling, aShipping);

        Address bBilling = new billingAddress("55", "Chicago", "IL", "52336");
        Address bShipping = new shippingAddress("22322", "Chicago", "IL", "33333");

        Customer b1 = new Customer("Greg", "Hastings", "34342", bBilling, bShipping);


        Address cBilling = new billingAddress("23432", "Top of the World", "NorthPole", "00000");
        Address cShipping = new shippingAddress("22265", "Fairfield", "IA", "52556");

        Customer c1 = new Customer("Charles", "Carpenter", "12431232", cBilling, cShipping);


        customerArray[0] = a1;
        customerArray[1] = b1;
        customerArray[2] = c1;

        for(Customer c : customerArray)
            System.out.println(c);


    }
}
