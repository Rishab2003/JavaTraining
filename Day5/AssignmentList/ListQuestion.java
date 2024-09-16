
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class ListQuestion {
    
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>(Arrays.asList(1,3,4,1,9,2,7,5));

        //odd numbers
        list.stream().filter(e -> e%2!=0).forEach(System.out::println);

        //max value
        System.out.println("max value is "+Collections.max(list));

        //sorted
        list.stream().sorted((a,b)->a.compareTo(b)).forEach(s->System.out.print(s+" "));
         
        
        
    }
}
