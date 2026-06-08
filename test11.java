import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please Enter your name below");
        String name = s.next();

        System.out.println("Please Enter your age below");
        int age = s.nextInt();

        System.out.println("Please Enter your Salary below");
        double salary = s.nextDouble();

        System.out.println("Please Enter your City below");
        String city = s.next();

        s.nextLine(); // buffer clear

        System.out.println("Please Enter your Details below");
        String details = s.nextLine();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("City : " + city);
        System.out.println("Details : " + details);

        s.close();
    }
}