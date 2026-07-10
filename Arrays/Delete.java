import java.util.Scanner;

public class Delete {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {11, 22, 33, 44, 55};

        int size = 5;

        System.out.println("Array Before Deletion:");

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nEnter position to delete:");
        int pos = sc.nextInt();

        for(int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println("\nArray After Deletion:");

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}