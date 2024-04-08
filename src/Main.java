public class Main {
    public static void main(String[] args) {

//        BankAccount miliciAccount = new BankAccount("12345", 10000, "Milici Ilie", "milici@yahoo.com", "123456");//🚧🚧[CONSTRUCTOR]🚧🚧
        BankAccount miliciAccount = new BankAccount();

        System.out.println(miliciAccount.getAccountNumber());
        System.out.println(miliciAccount.getAccountBalance());

//        miliciAccount.setName("Milici Ilie");
//        miliciAccount.setEmail("milici@yahoo.com");
//        miliciAccount.setPhoneNumber("+4012348552");
//        miliciAccount.setAccountBalance(4000);
//        miliciAccount.setAccountNumber("123");

        miliciAccount.depositFunds(2000);
        miliciAccount.depositFunds(1500);

        miliciAccount.withdrawFunds(10.20);
        miliciAccount.withdrawFunds(1000);
        miliciAccount.withdrawFunds(3000);

        BankAccount lucaAccount = new BankAccount("Luca", "Luca@gmail.com", "12345");
        System.out.println("AccountNo: " + lucaAccount.getAccountNumber() + "; name " + lucaAccount.getName("Luca"));

        /////////////////////////////CHALLENGE CONSTRUCTOR////////////////////////////////////////

        ConstructorChallenge roxana = new ConstructorChallenge("Milici Roxana", 100.0, "milici.roxi@gmail.com");//calling the CONSTRUCTOR, but with our new values that we write here
        System.out.println(roxana.getName());
        System.out.println(roxana.getCreditLimit());
        System.out.println(roxana.getAddress());

        ConstructorChallenge secondRoxana = new ConstructorChallenge();
        System.out.println(secondRoxana.getName());
        System.out.println(secondRoxana.getCreditLimit());
        System.out.println(secondRoxana.getAddress());

        ConstructorChallenge David = new ConstructorChallenge("David", "david@yahoo.com");
        System.out.println(David.getName());
        System.out.println(David.getCreditLimit());
        System.out.println(David.getAddress());

        /////////////////////////////////HOUSE CONSTRUCTOR///////////////////////////////////////

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println("----------1------------");
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

        System.out.println("----------2------------");
        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

        System.out.println("----------3------------");
        House greenHouse = new House("green");
        anotherHouse = greenHouse;
        System.out.println(blueHouse.getColor());
        System.out.println(greenHouse.getColor());
        System.out.println(anotherHouse.getColor());

    }
}
