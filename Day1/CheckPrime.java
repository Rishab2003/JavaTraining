import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=1;i<=n;i++){
            if(checkPrime(i))
                System.out.println(i);
        }

    }

    static boolean checkPrime(int n){
        if(n<=1)
        return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            return false;
        }

        return true;
    }

}
