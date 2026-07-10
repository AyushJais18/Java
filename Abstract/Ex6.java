import java.util.Scanner;

abstract class Employees {
    abstract void salary(); 
}

class developer extends Employees{
    void salary(){
        System.out.println("developer salary: "+ 60000);
    }
}

class tester extends Employees{
    void salary(){
        System.out.println("tester salary: "+ 50000);
    }
}

public class Ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        
        System.out.println("choose the employee designation number:");
        System.out.println("1. developer");
        System.out.println("2. tester");

        int choice = s.nextInt();

        switch(choice){
            case 1: 
                developer d = new developer();
                d.salary();
                break;
            case 2: 
                tester t = new tester();
                t.salary();
                break;
            default: 
                System.out.println("Invalid choice");
        }
        
    }
}

    