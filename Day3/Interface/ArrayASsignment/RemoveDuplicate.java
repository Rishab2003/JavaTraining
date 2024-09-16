package Interface.ArrayASsignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    
    public static void main(String[] args) {
        int[] ar={3,6,2,2,8,9,1,7,8,7};
        System.out.println(Arrays.toString(modifyArray(ar)));
    }

    public static int[] modifyArray(int[] ar){
        HashSet<Integer> set=new HashSet<>();
        for(int x:ar){
            set.add(x);
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        int[] ans=new int[list.size()];
        for(int i=0;i<set.size();i++){
            ans[i]=list.get(i);
        }

        return ans;

        

    }
}
