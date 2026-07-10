class SingleParent {

    int a = 10;
    int b = 20;

    void display() {
        System.out.println("This is Parent class method");
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }
}

class SingleChild extends SingleParent {

    int c = 30;

    void show() {
        System.out.println("This is Child class method");
        System.out.println("Value of c = " + c);
    }
}

public class Singletype {

    public static void main(String[] args) {

        SingleChild obj = new SingleChild();

        
        obj.display();

        
        obj.show();

        
        System.out.println("Sum of a + b = " + (obj.a + obj.b));

        
        System.out.println("Value of c = " + obj.c);
    }
}