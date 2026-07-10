
class SuperEx2Parent {
    int a = 10;
    int b = 20;
}

public class SuperEx2 extends SuperEx2Parent {

    int a = 100;
    int b = 200;

    void m1(int a, int b) {

        // Local variables
        System.out.println("Local Variables : " + (a + b));

        // Current class variables
        System.out.println("Child Class Variables : " + (this.a + this.b));

        // Parent class variables
        System.out.println("Parent Class Variables : " + (super.a + super.b));
    }

    public static void main(String[] args) {

        SuperEx2 t = new SuperEx2();
        t.m1(1000, 2000);
    }
}