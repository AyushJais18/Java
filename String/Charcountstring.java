public class Charcountstring {

    public static void main(String[] args) {

        String s = "Great Responsibility";

        char[] ch = s.toLowerCase().toCharArray();

        for (int i = 0; i < ch.length; i++) {

            int count = 1;

            if (ch[i] == '0' || ch[i] == ' ') {
                continue;
            }

            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0'; // Mark duplicate
                }
            }

            System.out.println(ch[i] + " = " + count);
        }
    }
}