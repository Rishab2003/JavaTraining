package Interface;

public interface ICalculator {
    
    public int calculate();

    public default void m1(){
        System.out.println("default method");
    }

    public static void m2(){
        System.out.println("static method");
    }
}
