import java.util.HashSet;
import java.util.Iterator;

public class SetIter {
    public static void main(String[] args) {
        HashSet<Double> set=new HashSet<Double>();

        set.add(2.2);
        set.add(3.1);
        set.add(3.2);
        set.add(8.1);
        double sum=0;
        Iterator iter=set.iterator();

        while(iter.hasNext()){
            sum=sum+(Double)iter.next();
        }
        System.out.println(sum);
    }
}
