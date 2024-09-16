package Interface.ArrayASsignment;
import java.util.Arrays;

public class SecondSmallest{
    public static void main(String[] args) {
       int ar[]={4,1,6,2,10};
       System.out.println(getSecondSmallest(ar));
        
    }

    static int  getSecondSmallest(int num[]){
        Arrays.sort(num);
        return num[num.length-2];
    }
}