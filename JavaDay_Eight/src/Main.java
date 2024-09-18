import java.util.*;
import java.util.stream.Collectors;

public class Main {
	 public static void main(String[] args) {
	        List<Employee> list=new ArrayList<>();

	        list.add(new Employee(100 , "rahul", 1000.2));
	        list.add(new Employee(101, "nik", 20000.1));
	        list.add(new Employee(102, "sav", 20000.2));
	        list.add(new Employee(102, "sav", 20000.8));
	        Employee emp1=new Employee(100,"rabi",99999.0);
	       
	        Employee max= list.stream().reduce(emp1,(e1,e2)-> 
	       				e1.getSalary()>e2.getSalary()? e1:e2);
	        System.out.println(max);
//	       max.stream().forEach(System.out::println);
	       
	       System.out.println("-------------");
	       
	       Optional<Employee> e=list.stream().sorted((e1,e2)->e2.getSalary().compareTo(e1.getSalary())).findFirst();
	       System.out.println(e.get());
	       
	       System.out.println("------");
	       
	       List<Employee> emp=list.stream().sorted((e1,e2)->e2.getSalary().compareTo(e1.getSalary()))
	    		   			.limit(3).collect(Collectors.toList());
	       
	       emp.stream().forEach(System.out::println);
	       
	       System.out.println("---");
	       
	       Optional<Employee> opp=list.stream().max((e1,e2)->e1.getSalary().compareTo(e2.getSalary()));
	       System.out.println(opp.get());
	       
	    }
}
