public class Test14 {
    int a = 10;
    int b = 20;
    static int c = 30;

    void m1(){
        System.out.println("Instance method without parameters");
        System.out.println("Sum  : "+(a + b));
        System.out.println(c);
    }

    void m2(int a, int b){
        System.out.println("Instance method with parameters");
        System.out.println(a + b);
    }

    static void m3(){
        System.out.println("Static method");
        System.out.println(c);
    }

    static void m4(int a, int b){
        System.out.println("Static method");
        System.out.println(a-b);

    }

    Test14(int a){
        System.out.println(a);
    }
    Test14(int a, int b){
        System.out.println(a + b);
    }



    public static void main(String[] args){
        Test14 t = new Test14(5);
        t.m1();
        t.m2(2,3);
        m3();
        m4(10,5);
        Test14 t1 = new Test14(3,6);

    }

}
