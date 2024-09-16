package Singleton;

public class Student {
    private static Student s = null;
    private Student(){

    }

    public static Student getInstance(){
        if(s==null){
            s=new Student();
            return s;
        }
        else
            return s;
    }

    public static void display(){
        System.out.println("Display method");
        System.out.println(s);
    }
}
