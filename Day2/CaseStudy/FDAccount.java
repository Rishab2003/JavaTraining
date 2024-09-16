

public class FDAccount extends Account{

    private int noOfDays;
    private String age;
    public FDAccount(double amount, int noOfDays, String age) throws NegativeAmountException {
        super(amount);
        this.noOfDays = noOfDays;
        this.age = age;
    }
    public int getNoOfDays() {
        return noOfDays;
    }
    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    @Override
    double calculateInterest() {
        // TODO Auto-geneinterestinterestRated method stub
        String category = "Senior Citizen"; // Category: "General" or "Senior Citizen"

        if(amount<10000000){
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = category.equalsIgnoreCase("Senior Citizen") ? 5.00 : 4.50;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                interestRate = category.equalsIgnoreCase("Senior Citizen") ? 5.25 : 4.75;
            } else if (noOfDays >= 30 && noOfDays <= 45) {
                interestRate = category.equalsIgnoreCase("Senior Citizen") ? 6.00 : 5.50;
            } else if (noOfDays >= 46 && noOfDays <= 60) {
                interestRate = category.equalsIgnoreCase("Senior Citizen") ? 7.50 : 7.00;
            } else if (noOfDays >= 61 && noOfDays <= 184) {
                interestRate = category.equalsIgnoreCase("Senior Citizen") ? 8.00 : 7.50;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                interestRate = category.equalsIgnoreCase("Senior Citizen") ? 8.50 : 8.00;
            } else {
                interestRate = -1; // Invalid period or category
            }
        }
        else{
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = 6.50;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                interestRate = 6.75;
            } else if (noOfDays >= 30 && noOfDays <= 45) {
                interestRate = 6.75;
            } else if (noOfDays >= 46 && noOfDays <= 60) {
                interestRate = 8.00;
            } else if (noOfDays >= 61 && noOfDays <= 184) {
                interestRate = 8.50;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                interestRate = 10.00;
            } else {
                interestRate = -1; // Invalid period
            }
        }

        return interestRate;

    }

    
    
}
