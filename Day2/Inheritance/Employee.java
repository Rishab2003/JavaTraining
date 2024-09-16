package Inheritance;

public class Employee extends Person {
    
    private int empid;

    public Employee(int empid,int uid,String name,int age){
        super(uid,name,age);
        this.empid=empid;

    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

}
