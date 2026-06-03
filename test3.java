import java.util.Scanner;

class test3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Choose Operation 1:Add 2:Sub 3:Mul 4:Div 5:Mod");
        int choice = sc.nextInt();

        switch(choice){

            case 1:
                System.out.println("The answer is " + (a+b));
                break;

            case 2:
                System.out.println("The answer is " + (a-b));
                break;

            case 3:
                System.out.println("The answer is " + (a*b));
                break;

            case 4:
                if(b != 0){
                    System.out.println("The answer is " + (a/b));
                }
                else{
                    System.out.println("Not divisible");
                }
                break;

            case 5:
                System.out.println("The answer is " + (a%b));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}