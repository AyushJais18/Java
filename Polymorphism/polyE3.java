package Polymorphism;

public class polyE3 {
    public static void main(String[] args) {
        System.out.println("Yes in Main method overloading concept is applicable");
        main(100);
        main("Shanya");
    }

    public static void main(int a){
        System.out.println(a);
    }

    public static void main(String a){
        System.out.println(a);
    }
}
