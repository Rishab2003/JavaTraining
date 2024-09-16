package Assignment.Bank;

public class Account {
    private long accNum;
    private double balance=0;
    private Person person;



    public void deposit(double money){
        this.balance+=money;
    }

    public void withdraw(double money) throws Exception{
        
        this.balance-=money;
    }

    public double getBalance(){
        return this.balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }
   
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Account(long accNum, Person person) {
        this.accNum = accNum;
        
        this.person = person;
    }
    
    

}
