class parent {
    void m1(){
        System.out.println("Parent class method");
    }
}

public class SuperEx1 extends parent {
    void m1(){
        System.out.println("child class method");
    }

    void m2(){
        this.m1();
        super.m1();
        System.out.println("M2 Method");
    }

    public static void main(String[] args) {
        SuperEx1 t = new SuperEx1();
        t.m2();
    }
}