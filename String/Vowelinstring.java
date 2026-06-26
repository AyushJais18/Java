public class Vowelinstring {

    public static void main(String[] args) {

        String s = "I am a good human being";

        int vowel = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                vowel++;
            }
        }

        System.out.println("Number of vowels = " + vowel);
    }
}