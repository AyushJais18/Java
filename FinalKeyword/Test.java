/*
create a class named 'Member' having the following members
data members 
1. Name 
2. Age 
3. Phone number 
4. Address 
5. Salary

it also has a method named 'printSalary' which prints the salary of the members.

Two classes 'Employee' and 'Manager' inherits the 'Member' Class.the 'Employe' and 'Manager' classes data members 'specialization' and 'Department' respectively. Now 

assign name, age, phone number, address, and salary to an employee and a manager by making an object of both of these classes and print the same.

*/

class Member {

    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary : " + salary);
    }
}

class Employee extends Member {

    String specialization;
}

class Manager extends Member {

    String department;
}

public class Test {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.name = "Ayush";
        emp.age = 22;
        emp.phoneNumber = "9876543210";
        emp.address = "Indore";
        emp.salary = 50000;
        emp.specialization = "Java Developer";

        Manager mgr = new Manager();
        mgr.name = "Shalini";
        mgr.age = 35;
        mgr.phoneNumber = "9999999999";
        mgr.address = "Bhopal";
        mgr.salary = 80000;
        mgr.department = "IT";

        System.out.println("----- Employee Details -----");
        System.out.println("Name : " + emp.name);
        System.out.println("Age : " + emp.age);
        System.out.println("Phone : " + emp.phoneNumber);
        System.out.println("Address : " + emp.address);
        System.out.println("Specialization : " + emp.specialization);
        emp.printSalary();

        System.out.println();

        System.out.println("----- Manager Details -----");
        System.out.println("Name : " + mgr.name);
        System.out.println("Age : " + mgr.age);
        System.out.println("Phone : " + mgr.phoneNumber);
        System.out.println("Address : " + mgr.address);
        System.out.println("Department : " + mgr.department);
        mgr.printSalary();
    }
}