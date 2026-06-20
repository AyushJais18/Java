import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int a[][] = new int[rows][];

        // Input column size for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter columns for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            a[i] = new int[cols];
        }

        // Input elements
        System.out.println("\nEnter Elements:");

        for (int i = 0; i < a.length; i++) {
            System.out.println("Row " + (i + 1) + ":");

            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                a[i][j] = sc.nextInt();
            }
        }

        // Display Jagged Array
        System.out.println("\n═══════ JAGGED ARRAY ═══════\n");

        for (int i = 0; i < a.length; i++) {

            // Top Border
            System.out.print("┌");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("─────");
                if (j < a[i].length - 1) {
                    System.out.print("┬");
                }
            }
            System.out.println("┐");

            // Data Row
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("│%5d", a[i][j]);
            }
            System.out.println("│");

            // Bottom Border
            System.out.print("└");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("─────");
                if (j < a[i].length - 1) {
                    System.out.print("┴");
                }
            }
            System.out.println("┘");
        }

        sc.close();
    }
}