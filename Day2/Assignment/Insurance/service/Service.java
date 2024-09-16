package Assignment.Insurance.service;

import java.util.ArrayList;
import java.util.Scanner;

import Assignment.Insurance.bean.Employee;

interface EmployeeService{
    void getDetails();
    void findInsuranceScheme(Employee e);
    ArrayList<Employee> display();
}



public class Service implements EmployeeService{

    private static ArrayList<Employee> emp=new ArrayList<>();
    private static Service s=null;
    private Service(){
    }

    public static Service getInstance(){
        if(s==null){
           s=new Service();
            return s;
        }
        else{
            return s;
        }

    }


    @Override
    public ArrayList<Employee> display() {
        return emp;
    }

    @Override
    public void findInsuranceScheme(Employee e)
    {
        if(e.getSalary()<40000){
            e.setInsuranceScheme("Basic Scheme");
        }
        else if(e.getSalary()<80000)
            e.setInsuranceScheme("Standard Scheme");
        else
            e.setInsuranceScheme("Premium Scheme");
    }

    @Override
    public void getDetails() {
        // TODO Auto-generated method stub
        Employee e=new Employee();
        Scanner scan=new Scanner(System.in);
        System.out.println("id");
        e.setId(scan.nextInt());
        System.out.println("name");
        e.setName(scan.next());
        System.out.println("Salary");
        e.setSalary(scan.nextDouble());
        System.out.println("designation");
        e.setDesignation(scan.next());

        emp.add(e);
    }

    
    
}
