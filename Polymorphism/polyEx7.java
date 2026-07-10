import java.util.Scanner;

public class polyEx7 {

    polyEx7(String EmpName, double Salary) {
        System.out.println("Employee_Name :" + EmpName);
        System.out.println("Salary : "+ Salary);
    }

    polyEx7(String EmpName, double Salary, double bonus) {
        System.out.println("Employee_Name :" + EmpName);
        System.out.println("Salary(included bonus) : "+ (Salary + bonus));
    }

    polyEx7(String EmpName, double Salary,double bonus, double incentives) {
        System.out.println("Employee_Name :" + EmpName);
        System.out.println("Salary(included bonus +inc.) : "+ (Salary + bonus + incentives));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Number the Arguments : 2 | 3 | 4");
        int numArg = s.nextInt();

        switch (numArg) {
            case 2: System.out.println("employee detail = name, salary and bonus");
                System.out.println("Please Enter the Employee Name");
                String Name2 = s.next();
                System.out.println("Please Enter the salary");
                double salary = s.nextDouble();
                polyEx7 obj1 = new polyEx7(Name2, salary);
                break;

            case 3: System.out.println("employee detail = name, salary and bonus");
            System.out.println("Please Enter the Employee Name");
            String Name3 = s.next();
            System.out.println("Please Enter the salary");
            double salary1 = s.nextDouble();
            System.out.println("Please Enter the bonus");
            double bonus = s.nextDouble();
            polyEx7 obj2 = new polyEx7(Name3, salary1,bonus);
            break;
            case 4: System.out.println("employee detail = name, salary and bonus");
            System.out.println("Please Enter the Employee Name");
            String Name4 = s.next();
            System.out.println("Please Enter the salary");
            double salary2 = s.nextDouble();
            System.out.println("Please Enter the bonus");
            double bonus1 = s.nextDouble();
            System.out.println("Please Enter the incentives");
            double inc = s.nextDouble();

            polyEx7 obj3 = new polyEx7(Name4, salary2, bonus1, inc);
            break;
            default:
                System.out.println("Invalid Arguments");
        }

    }

    
    
}
