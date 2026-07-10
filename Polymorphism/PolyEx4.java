import java.util.Scanner;

public class PolyEx4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // Calling overloaded main methods
        main(num);
        main(str);

        sc.close();
    }

    public static void main(int a) {
        System.out.println("Integer main() called");
        System.out.println("Value = " + a);
    }

    public static void main(String a) {
        System.out.println("String main() called");
        System.out.println("Value = " + a);
    }
}