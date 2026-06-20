public class StringDemo {
    public static void main(String[] args) {
        String S1 = new String("Java");
        String S2 = new String("Java");

        System.out.println(S1 == S2);       // false (different objects)
        System.out.println(S1.equals(S2));  // true (same content)
    }

}