import java.util.Scanner;

class test18 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {

                if (j == 1 || i == j || i == n) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}