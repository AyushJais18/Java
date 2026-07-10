import java.util.Scanner;

public class Insert {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;

        int size = 5;

        System.out.println("Enter the element to insert");
        int element = sc.nextInt();

        System.out.println("Enter the position to insert");
        int pos = sc.nextInt();

        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = element;
        size++;

        System.out.println("\nArray After Insertion:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}