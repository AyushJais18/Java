import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            sc.next(); // wrong input remove karega
        }

        int size = sc.nextInt();

        String[] names = new String[size];

        System.out.println("Enter the names:");

        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        System.out.print("Enter the search name: ");
        String searchName = sc.next();

        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Name Found");
        } else {
            System.out.println("Name Not Found");
        }

        sc.close();
    }
}