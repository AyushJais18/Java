import java.util.Scanner;

class test12{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number");

    int a = sc.nextInt();

    System.out.println("Enter second number");

    int b = sc.nextInt();

    System.out.println("Choose operation + , - , * , / , % ");

    char operation = sc.next().charAt(0);
    switch (operation) {
        case '+': ;
        System.out.println("Addition ="+ (a+b));
        break;
        case '-': ;
        System.out.println("Substraction ="+ (a-b));
        break;
        case '*': ;
        System.out.println("Multiplication ="+ (a*b));
        break;
        case '/': ;
        if (b != 0){
            System.out.println("a/b");
        }else {
            System.out.println("not defined");
        }
        System.out.println("Division ="+ (a/b));
        break;
        case '%': ;
        System.out.println("Modulous ="+ (a%b));
        break;

        default:
        System.out.println("Invalid Operation");
        
    
    } sc.close();
}
}