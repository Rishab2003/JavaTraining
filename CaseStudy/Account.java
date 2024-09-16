

public abstract class Account {
    double interestRate=0;
    double amount;


    

    public Account( double amount) throws NegativeAmountException {
        if(amount<0)
        throw new NegativeAmountException("Amount cant be negative");
        this.amount = amount;
    }

    


    abstract double calculateInterest();




    public double getInterestRate() {
        return interestRate;
    }




    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }




    public double getAmount() {
        return amount;
    }




    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
