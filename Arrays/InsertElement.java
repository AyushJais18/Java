import java.util.Scanner;

public class InsertElement {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size + 1]; // Extra space for insertion

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // ================= BEFORE INSERTION =================

        System.out.println("\nARRAY BEFORE INSERTION\n");

        System.out.print("┌");
        for (int i = 0; i < size - 1; i++) {
            System.out.print("─────┬");
        }
        System.out.println("─────┐");

        for (int i = 0; i < size; i++) {
            System.out.printf("│ %3d ", arr[i]);
        }
        System.out.println("│");

        System.out.print("├");
        for (int i = 0; i < size - 1; i++) {
            System.out.print("─────┼");
        }
        System.out.println("─────┤");

        for (int i = 0; i < size; i++) {
            System.out.printf("│ %3d ", i);
        }
        System.out.println("│");

        System.out.print("└");
        for (int i = 0; i < size - 1; i++) {
            System.out.print("─────┴");
        }
        System.out.println("─────┘");

        // ================= INPUT =================

        System.out.print("\nEnter the element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter the position (0 to " + size + "): ");
        int pos = sc.nextInt();

        // ================= INSERTION =================

        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = element;
        size++;

        // ================= AFTER INSERTION =================

        System.out.println("\nARRAY AFTER INSERTION\n");

        System.out.print("┌");
        for (int i = 0; i < size - 1; i++) {
            System.out.print("─────┬");
        }
        System.out.println("─────┐");

        for (int i = 0; i < size; i++) {
            System.out.printf("│ %3d ", arr[i]);
        }
        System.out.println("│");

        System.out.print("├");
        for (int i = 0; i < size - 1; i++) {
            System.out.print("─────┼");
        }
        System.out.println("─────┤");

        for (int i = 0; i < size; i++) {
            System.out.printf("│ %3d ", i);
        }
        System.out.println("│");

        System.out.print("└");
        for (int i = 0; i < size - 1; i++) {
            System.out.print("─────┴");
        }
        System.out.println("─────┘");

        sc.close();
    }
}