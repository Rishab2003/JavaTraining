package Interface.ArrayASsignment;

import java.util.Arrays;


public class Reverse {
    
    public static void main(String[] args) {

        int ar[]={2,4,1,23,92,83};
        System.out.println(Arrays.toString(getSorted(ar)));
    }

    static int[] getSorted(int[] ar){
        for(int i=0;i<ar.length;i++){
            ar[i]=reverseNumber(ar[i]);
        }
        System.out.println(Arrays.toString(ar));

        Arrays.sort(ar);

        return ar;
        
    }
    static int reverseNumber(int n){
        int rev=0;
        while(n>0){
            rev=(n%10)+rev*10;
            n=n/10;
        }
        return rev;
    }


    
}
