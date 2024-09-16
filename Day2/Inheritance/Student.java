package Inheritance;

public class Student extends Person {

    private String rollNo;

    
    public Student(int uid, String name, int age, String rollNo) {
        super(uid, name, age);
        this.rollNo = rollNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    
    
    
}
