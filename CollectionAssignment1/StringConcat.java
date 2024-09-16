import java.util.HashSet;
import java.util.Iterator;

public class StringConcat {
    public static void main(String[] args) {
         HashSet<String> set=new HashSet<String>();

        set.add("apple");
        set.add("orange");
        set.add("java");
        set.add("aaaa");

        Iterator iter=set.iterator();

        String s="";

        while (iter.hasNext()) {
            s+=iter.next();
        }
        System.out.println(s);

    }
}
