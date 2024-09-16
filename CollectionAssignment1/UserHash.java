import java.util.HashSet;

public class UserHash {
    
    public static void main(String[] args) {
        HashSet set=new HashSet(5);

        set.add("apple");
        set.add("pen");
        set.add(new MyOwnClass("rishab", 21));
        set.add(new MyOwnClass("rahul", 22));
        set.add(2);
        set.add(4);
        set.add(9);
        System.out.println(set);
    }
}
