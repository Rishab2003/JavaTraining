package Inheritance;
import java.util.Arrays;

public class Calculator {

    public int sum(int... a) {
        System.out.println("var args");

        return Arrays.stream(a).sum();
    }

    public int sum(int a, int b) {
        System.out.println("Method param");
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 3));
        // why because method overloading is from older version
        // so it gets executed first
    }
}