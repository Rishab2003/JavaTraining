
import java.util.Scanner;

public class Main {
    
   public static void main(String[] args) throws NegativeAmountException {
   
    Scanner scan=new Scanner(System.in);

    System.out.println("Interest Calculator-SB");
    System.out.println("Interst Calculator-FD");
    System.out.println("Interst Calculator-RD");
    System.out.println("exit");

    switch (scan.nextInt()) {
        case 1: 
                System.out.println("Enter the Average amount in your account:");
                int amt=scan.nextInt();
                System.out.println("Enter type NRI or Normal");
                SBAccount sbAccount=new SBAccount(amt, scan.next());
                double intrestSB=sbAccount.calculateInterest();
                System.out.println( sbAccount.getAmount()-  (sbAccount.getAmount()*intrestSB)/100);
            
            break;
    
        case 2:
                System.out.println("Enter fd amount");
                double fd=scan.nextDouble();
                System.out.println("Enter no of days");
                int days=scan.nextInt();
                System.out.println("ENter General or senior Citizen");
                String age=scan.next();
                FDAccount fdAccount=new FDAccount(fd, days, age);
                double intrestFD=fdAccount.calculateInterest();
                System.out.println( fdAccount.getAmount()- (fdAccount.getAmount()*intrestFD )/100);
                

        case 3:
                System.out.println("Enter fd amount");
                double rd=scan.nextDouble();
                System.out.println("Enter no of months");
                int month=scan.nextInt();
                RDAccount rdAccount=new RDAccount(rd, month);
                double intrestRD=rdAccount.calculateInterest();
                System.out.println(rdAccount.getAmount()-(rdAccount.getAmount()*intrestRD)/100);

        
        case 4:
                break;
        default:
            break;
    }
   }
    
}
