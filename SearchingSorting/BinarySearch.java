import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = {10, 20, 30, 40, 50, 60, 70};

        int low = 0;
        int high = a.length - 1;

        System.out.print("Enter Element to Search: ");
        int key = sc.nextInt();

        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (a[mid] == key) {
                found = true;
                System.out.println("Key Found at Position: " + mid);
                break;
            }
            else if (a[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Key Not Found");
        }

        sc.close();
    }
}

