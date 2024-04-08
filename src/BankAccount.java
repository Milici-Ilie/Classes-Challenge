public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String name;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getName(String milici) {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /////////////// 🚧🚧[CONSTRUCTOR]🚧🚧 ///////////////////

    public BankAccount() {
        this("12345", 100.0, "Milici", "milici@yahoo.com", "0730114897");//🚧🚧[CONSTRUCTOR]🚧🚧 calling a CONSTRUCTOR inside of another Constructor, calling the Constructor from bellow === ❗❗❗❗ always
        // the "this" calling CONSTRUCTOR must be the first line in the method
        System.out.println("Empty constructor called");
    }//calling the constructor, but this is an empty constructor

    public BankAccount(String number, double balance, String customerName, String emaill, String phone) {

        System.out.println("Account constructor with paramaters called");
        this.accountNumber = number;
        this.accountBalance = balance;
        this.name = customerName;
        email = emaill;
        phoneNumber = phone;
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this("9999", 100.55, name, email, phoneNumber);
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }// in this CONSTRUCTOR we assign the arguments directly to the instance fields

    /////////////// 🚧🚧[CONSTRUCTOR]🚧🚧 ///////////////////

    //////////////// METHODS ///////////////////

//    public void accountBallance() {
//        System.out.println(name + " your account balance is: " + accountBalance + "$");
//    }

    public void depositFunds(double depositAmount) {

        accountBalance += (depositAmount);
        System.out.println("Deposit of $" + depositAmount + " made. New balance is " + accountBalance);
        //creating the logic of depositing funds in the bank account
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println(name + ", we are sorry but your Account Balance " + accountBalance + " is insufficient to proceed for a withdraw!");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println(name + ", withdrawal of $" + withdrawalAmount + " processes, Remaining balance = $" + accountBalance);
        }
    }//the logic of withdrawn funds

}
