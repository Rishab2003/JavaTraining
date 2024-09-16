package Assignment.Bank;

public class CurrentAccount extends Account {

    private double overDraft_limit=2000;
    public CurrentAccount(long accNum, Person person) {
        super(accNum, person);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void withdraw(double money) throws Exception {
        if(money>this.overDraft_limit){
            throw new Exception("Cant withdrae. Withdraw limit is "+overDraft_limit);
        }
    }


    


    
}
