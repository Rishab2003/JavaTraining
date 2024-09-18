import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class Main {
	public static void main(String[] args) {
		
		List<Employee> emp=EmployeeRepository.getEmployees();
		List<Department> dep=EmployeeRepository.getDepartments();
		
		//sum of salary of employees
		Double sum=emp.stream().map(e->e.getSalary()).reduce(0.0,(e1,e2)->e1+e2);
		
		System.out.println("Sum of sallary is "+sum);
		
		//(group employees by department)
		Map<Optional<Department>,List<Employee>> group=
		emp.stream().collect(Collectors.groupingBy(e -> Optional.ofNullable(e.getDepartment())));
		
		group.entrySet().stream().filter(e->e.getKey().isPresent()).forEach(
				e->System.out.println(e.getKey().get().getDepartmentName()+ " has "+
									  e.getValue().size()));
		
		
		//senior most
		emp.stream().filter(e->e.getDesignation().equals("President")).forEach(e->System.out.println(e));
		
		//department without employees
		List<Department> Depart=group.entrySet().stream().filter(e->e.getKey().isPresent()).map(e->e.getKey().get()).collect(Collectors.toList());
		
		dep.stream().filter(e->!Depart.contains(e)).forEach(e->System.out.println(e.getDepartmentName()));
		
		//department with high emp
		System.out.println("-----");
		String ans=group.entrySet().stream().filter(e->e.getKey().isPresent()).sorted((a,b)->b.getValue().size()-a.getValue().
				size()).map(e->e.getKey()).findFirst().get().get().getDepartmentName();
		
		System.out.println(ans);
		Calendar c=Calendar.getInstance();
		//employyee name and their service
		emp.stream().forEach(e->{
					int crntYear=c.get(Calendar.YEAR);
					int crntMonth=c.get(Calendar.MONTH);
					int Tmonths;
					int YearDifference=crntYear-e.getHireDate().getYear();
					if(crntMonth-e.getHireDate().getMonthValue()>0)
						Tmonths=12*YearDifference + crntMonth-e.getHireDate().getMonthValue() ;
					else
						Tmonths=12*YearDifference - Math.abs(crntMonth-e.getHireDate().getMonthValue()) ;
					System.out.println(e.getFirstName()+" "+Tmonths+ " months");
				}
				);
		
		
}
}
