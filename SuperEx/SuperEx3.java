class SuperEx3Parent {

    SuperEx3Parent(int a, int b) {
        System.out.println("Parent Constructor : " + (a + b));
    }
}

public class SuperEx3 extends SuperEx3Parent {

    SuperEx3(int a) {
        super(100, 200);   // Calls Parent constructor
        System.out.println("Child Constructor : " + a);
    }

    public static void main(String[] args) {

        SuperEx3 t = new SuperEx3(10);
    }
}