public class StringEquals {
    public static void main(String[] args) {
        String S1 = "Coding Thinker";
        String S2 = "Coding Think";

        System.out.println(S1 == S2);        // true (same object in string pool)
        System.out.println(S1.equals(S2));   // true (same content)
    }
}
