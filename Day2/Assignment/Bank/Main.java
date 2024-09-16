package Assignment.Bank;


public class Main {

    public static void main(String[] args) throws Exception {

        Person smith = new Person("Smith", 24);
        Account AccSmith = new Account((long) Math.random(), smith);

        Person Kathy = new Person("Kathy", 43);
        Account AccKathy = new Account((long) Math.random(), Kathy);

        System.out.println("Depositing 2000 from Smith");
        AccSmith.deposit(2000);
        System.out.println("Smith balance: " + AccSmith.getBalance());

        System.out.println("Withdraw from kathy");
        AccKathy.withdraw(2000);
        System.out.println("Kathy Balance: "+AccKathy.getBalance());

        //Savings Account
        System.out.println("******************");

        Account AccSaveSmith=new SavingsAccount(223, smith);
        AccSaveSmith.deposit(2000);
        AccSaveSmith.withdraw(1800);
       

        Account a=new CurrentAccount(33, Kathy);
        a.withdraw(89999);
        
    }

}
