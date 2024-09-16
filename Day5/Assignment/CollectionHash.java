import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class CollectionHash {
    public static void main(String[] args) {
        HashSet set=new HashSet<>();

        set.add("set");
        set.add("set");
        set.add(new MyOwnClass("bala", 11));
        set.add(new MyOwnClass("ravi", 99));
        
        set.add(1);
        set.add(2);
        set.add(8);

        Iterator iterSet=set.iterator();

        while (iterSet.hasNext()) {
            Object a=iterSet.next();
            if(a instanceof MyOwnClass){
                System.out.println(a.toString());
            }
            else
            System.out.println(a);
        }

        System.out.println("---------------Arraylist");
        List list=new ArrayList<>();
        list.addAll(set);

        Iterator iterList=set.iterator();

        while (iterList.hasNext()) {
            Object a=iterList.next();
            if(a instanceof MyOwnClass){
                System.out.println(a.toString());
            }
            else
            System.out.println(a);
        }
        System.out.println("---------------LinkedHashSet");


        LinkedHashSet hset=new LinkedHashSet<>();
        hset.addAll(set);
        Iterator iterHset=hset.iterator();

        while (iterHset.hasNext()) {
            Object a=iterHset.next();
            if(a instanceof MyOwnClass){
                System.out.println(a.toString());
            }
            else
            System.out.println(a);
        }


        
    }
}
