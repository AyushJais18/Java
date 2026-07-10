public class mixVariable {
    static int a = 10;
    static int b = 5 ;
    public static void main(String[] args) {
        mixVariable t = new mixVariable();
        t.a = 44;
        t.b = 55;
        System.out.println(a);
        System.out.println(b);
        mixVariable t1 = new mixVariable();
        System.out.println(a);
        System.out.println(b);

    }
}
