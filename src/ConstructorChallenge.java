public class ConstructorChallenge {
//🚧🚧[CONSTRUCTOR]🚧🚧  🚧🚧[CONSTRUCTOR]🚧🚧  🚧🚧[CONSTRUCTOR]🚧🚧
    //////////////////////////////ENCAPSULATION DATA///////////////////////////////////

    private String name;
    private double creditLimit;
    private String address;//those 3 data is the ENCAPSULATION of the data

    ///////////////////////////////////GETTERS////////////////////////////////////

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getAddress() {
        return address;
    }// using "getters" we access the ENCAPSULATION data from above

    ///////////////////////////CONSTRUCTOR////////////////////////////////////////

    public ConstructorChallenge(String name, double creditLimit, String address) {
//        this("Roxana", 10.0000, "Timisoara");
        this.name = name;
        this.creditLimit = creditLimit;
        this.address = address;
    }// in this CONSTRUCTOR we assign the arguments directly to the instance fields

    //after creating some CONSTRUCTORS we can call them in the "Main.java" class

    public ConstructorChallenge() {
        this("Roxana", "Timisoara");// here we are calling the CONSTRUCTOR from bellow 👇, in this CONSTRUCTOR, the "creditLimit" will be automatically be written by default from the CONSTRUCT bellow
    }

    public ConstructorChallenge(String name, String address) {
        this(name, 1000, address);// here we are calling another CONSTRUCTOR, here we are HARD CODING the value of the "creditLimit"
    }


}
