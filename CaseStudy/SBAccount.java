
public class SBAccount extends Account {

    private String type;
    

    public SBAccount(double amount, String type) throws NegativeAmountException {
        super(amount);
        this.type = type;
    }


    @Override
    double calculateInterest() {
        if(type.equals("normal"))
        interestRate=4;
        else if(type.equals("NRI"))
        interestRate=6;

        return interestRate;

    }


    
}
