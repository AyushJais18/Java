package Constructor;

/* 
1) it is block, it is used to initialize the object.
2) It is executed at the time of object creation.
3) Default constructor create by compiler.
also hhas user defined constructor.
*/ 

public class testing1 {

    // testing1(){
    //     System.out.println("Zero Argument Constructor");
    // }
    // Parametrized Constructor

    testing1(int a, int b){
        System.out.println("Addition "+ (a + b));
    }

    void m1(){
        System.out.println("m1");
    }
    public static void main(String[] args){

        testing1 t = new testing1(3,4);
        t.m1();

    }

    
}
