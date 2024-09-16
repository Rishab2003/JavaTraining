package Exrecises;

class classA{
    int a;
    public classA(int a){
        this.a=a;
        System.out.println("A "+ a);
    }
    
}

class classB{
    int b;
    public classB(int b){
        System.out.println("B "+ b);
    }

}

class classC extends classA{
    int c;
    classB b;

    classC(int a,classB b,int c){
        super(a);
        this.c=c;
        this.b=b;
        System.out.println("C "+c);
        System.out.println(b.hashCode());
    }
}
public class Main {
    public static void main(String[] args) {
        classB b =new classB(4);
        classC c = new classC(1,b,2);

        System.out.println(b.hashCode());
        
        
    }
    
    
    
    
    
}
