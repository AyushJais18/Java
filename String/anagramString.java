public class anagramString {

    public static void main(String[] args) {

        String S1 = "Listen";
        String S2 = "Silent";

        String s1 = S1.toLowerCase();
        String s2 = S2.toLowerCase();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        // Sort first string
        for (int i = 0; i < ch1.length - 1; i++) {
            for (int j = 0; j < ch1.length - 1 - i; j++) {
                if (ch1[j] > ch1[j + 1]) {
                    char temp = ch1[j];
                    ch1[j] = ch1[j + 1];
                    ch1[j + 1] = temp;
                }
            }
        }

        // Sort second string
        for (int i = 0; i < ch2.length - 1; i++) {
            for (int j = 0; j < ch2.length - 1 - i; j++) {
                if (ch2[j] > ch2[j + 1]) {
                    char temp = ch2[j];
                    ch2[j] = ch2[j + 1];
                    ch2[j + 1] = temp;
                }
            }
        }

        boolean isAnagram = true;

        if (ch1.length != ch2.length) {
            isAnagram = false;
        } else {
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}