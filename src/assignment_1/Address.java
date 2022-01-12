package assignment_1;

public abstract class Address {
    String street;
    String city;
    String state;
    String zip;


    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
