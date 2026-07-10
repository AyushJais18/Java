// Constructor overloading

public class polyEx6 {

    polyEx6(int a) {
        System.out.println(a);
    }
    polyEx6(int a,int b) {
        System.out.println(a + b);
    }
    polyEx6(int a,int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        polyEx6 t = new polyEx6(10);
        polyEx6 t1 = new polyEx6(10,20);
        polyEx6 t2 = new polyEx6(10,20,30);
        
    }
}
