
public class RDAccount extends Account {

    private int noOfMonths;
    
    
    public RDAccount(double amount, int noOfMonths) throws NegativeAmountException {
        
        super(amount);
        this.noOfMonths = noOfMonths;
        
    }

    @Override
    double calculateInterest() {
        String category = "Senior Citizen"; // Category: "General" or "Senior Citizen"

        if (noOfMonths == 6) {
            interestRate = category.equalsIgnoreCase("Senior Citizen") ? 8.00 : 7.50;
        } else if (noOfMonths == 9) {
            interestRate = category.equalsIgnoreCase("Senior Citizen") ? 8.25 : 7.75;
        } else if (noOfMonths == 12) {
            interestRate = category.equalsIgnoreCase("Senior Citizen") ? 8.50 : 8.00;
        } else if (noOfMonths == 15) {
            interestRate = category.equalsIgnoreCase("Senior Citizen") ? 8.75 : 8.25;
        } else if (noOfMonths == 18) {
            interestRate = category.equalsIgnoreCase("Senior Citizen") ? 9.00 : 8.50;
        } else if (noOfMonths == 21) {
            interestRate = category.equalsIgnoreCase("Senior Citizen") ? 9.25 : 8.75;
        } else {
            interestRate = -1; // Invalid period or category
        }

        return interestRate;
    }

    

    
    


    
    
}
