package Assignment.Insurance.pl;

import java.util.ArrayList;

import Assignment.Insurance.bean.Employee;
import Assignment.Insurance.service.Service;

public class Main {
    public static void main(String[] args) {
        
        Service empService=Service.getInstance();
        ArrayList<Employee> ar;
        empService.getDetails();
        empService.getDetails();    
        ar=empService.display();


        ar.stream().forEach(e->empService.findInsuranceScheme(e));

        ar.stream().forEach(e->System.out.println(e));
        


        
    }
}
