package Polymorphism;

public class PolyEx2 {
    void m1(int i){
        System.out.println(i);
    }
    void m1(char i){
        System.out.println(i);
    }
    void m1(String i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        PolyEx2 t = new PolyEx2();
        t.m1(10);
        t.m1('K');
        t.m1("Kavlin");
    }
}
