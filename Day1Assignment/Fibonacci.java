import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        int first=1;
        int second=1;
        int third=0;
        Scanner scan=new Scanner(System.in);
        int fibNum=scan.nextInt();
        
        for(int i=3;i<=fibNum;i++){
            third=first+second;
            
            first=second;
            second=third;
        }

        System.out.println(third+" Normal method");
        System.out.println(fibonacci(fibNum)+" Recusrion");
    }

    static int fibonacci(int n){
        if(n==0)
        return 0;
        if(n==1)
        return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }
    
}
