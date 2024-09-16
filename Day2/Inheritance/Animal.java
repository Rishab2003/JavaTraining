package Inheritance;
public class Animal {
    Animal(){
        System.out.println("animal cons");
    }
    public void eat(){
        System.out.println("Animal eat");
    }
}

class Dog extends Animal{

    Dog(){
        System.out.println("dog cons");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    public void bark(){
        System.out.println("Bark");
    }
    
}

class Cat extends Animal{

    public void eat(){
        System.out.println("Cat eat");
    }

    public void meow(){
        System.out.println("meow");
    }
}
