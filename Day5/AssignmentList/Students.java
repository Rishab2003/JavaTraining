import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students implements Comparable<Students> {
    private int marks;
    private String name;

    

    public Students(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
    

    @Override
    public String toString() {
        return "Students [marks=" + marks + ", name=" + name + "]";
    }


    @Override
    public int compareTo(Students o) {
        // TODO Auto-generated method stub
        return o.marks-this.marks;
    }

    public static void main(String[] args) {

        List<Students> list=new ArrayList<Students>();
        list.add(new Students(72, "Ravi"));
        list.add(new Students(88, "bala"));
        list.add(new Students(99, "rahul"));
        list.add(new Students(81, "paul"));

        Collections.sort(list);

        list.stream().limit(3).forEach(e->System.out.println(e));


        
    }

}