// same argument name but different parameter;
public class polyEx1 {
    void m1(int a){
        System.out.println("a = , " + a );

    }

    void m1(int a, int b){
        System.out.println("a = , " + a + " b = " + b);


    }

    void m1(int a, int b , int c){
        System.out.println("a = , " + a + " b = " + b + " c " + c);
    }

    public static void main(String[] args) {
        polyEx1 t = new polyEx1();
        t.m1(10);
        t.m1(10,20);
        t.m1(10,20,30);
    }

}