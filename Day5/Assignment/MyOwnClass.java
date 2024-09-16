public class MyOwnClass{
    private String Name;
    private int age;
    
    public MyOwnClass(String name, int age) {
        Name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyOwnClass [Name=" + Name + ", age=" + age + "]";
    }
    

    
}