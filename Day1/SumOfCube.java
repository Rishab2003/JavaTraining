import java.util.Scanner;

public class SumOfCube {
    public static void main(String[] args) {
        int sum=0;

        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        while(n>0){
            sum+=(int)Math.pow((n%10),3);
            n=n/10;

        }

        System.out.println(sum);
    }
}
