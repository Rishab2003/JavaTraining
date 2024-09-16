package Singleton;

public class Main {
    public static void main(String[] args) {
        
        Student s= Student.getInstance();
        
        Student s2=Student.getInstance();

        

        //gets the same object every time

        System.out.println(s);
        System.out.println(s2);

    }

}
