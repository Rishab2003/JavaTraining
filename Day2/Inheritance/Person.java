package Inheritance;


public class Person {

    private int uid;
    private String name;
    private int age;
    
    

    public Person(int uid, String name, int age) {
        this.uid = uid;
        this.name = name;
        this.age = age;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    

    
}
