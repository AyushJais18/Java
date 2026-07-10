import java.util.Scanner;

// Constructor Overloading Example
public class polyEx8 {

    // Constructor 1
    polyEx8(String branch) {
        System.out.println("\nStudent Details");
        System.out.println("Branch : " + branch);
    }

    // Constructor 2
    polyEx8(String branch, String college) {
        System.out.println("\nStudent Details");
        System.out.println("Branch : " + branch);
        System.out.println("College Name : " + college);
    }

    // Constructor 3
    polyEx8(String branch, long idNum) {
        System.out.println("\nStudent Details");
        System.out.println("Branch : " + branch);
        System.out.println("Identity Number : " + idNum);
    }

    // Constructor 4
    polyEx8(String branch, String college, long idNum) {
        System.out.println("\nStudent Details");
        System.out.println("Branch : " + branch);
        System.out.println("College Name : " + college);
        System.out.println("Identity Number : " + idNum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Number of Arguments");
        System.out.println("1 = Branch");
        System.out.println("2 = Branch + College");
        System.out.println("3 = Branch + ID");
        System.out.println("4 = Branch + College + ID");

        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {

            case 1:
                System.out.print("Enter Branch Name: ");
                String branch1 = sc.nextLine();

                new polyEx8(branch1);
                break;

            case 2:
                System.out.print("Enter Branch Name: ");
                String branch2 = sc.nextLine();

                System.out.print("Enter College Name: ");
                String college2 = sc.nextLine();

                new polyEx8(branch2, college2);
                break;

            case 3:
                System.out.print("Enter Branch Name: ");
                String branch3 = sc.nextLine();

                System.out.print("Enter Identity Number: ");
                long id3 = sc.nextLong();

                new polyEx8(branch3, id3);
                break;

            case 4:
                System.out.print("Enter Branch Name: ");
                String branch4 = sc.nextLine();

                System.out.print("Enter College Name: ");
                String college4 = sc.nextLine();

                System.out.print("Enter Identity Number: ");
                long id4 = sc.nextLong();

                new polyEx8(branch4, college4, id4);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}