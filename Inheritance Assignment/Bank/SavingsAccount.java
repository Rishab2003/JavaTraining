package Assignment.Bank;

public class SavingsAccount extends Account {

    private final double MinBalance=500;

    public SavingsAccount(long accNum, Person person) {
        super(accNum, person);
    }

    @Override
    public void withdraw(double money) throws Exception {
        
        if(money>getBalance()){
            throw new Exception("Cannot withdraw. Acct balance is less"+"The balance is "+getBalance());
        }
      
        if(getBalance()-money<MinBalance){
            throw new Exception("Withdrawal Denied. Minimum balance of 500 is needed "+"Balance after withdrawl is "+(super.getBalance()-money));
        }
        else{
            super.setBalance(getBalance()-money);
            System.out.println("Success");
        }
        
    }


    

  

    
}
