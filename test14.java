// take input from user 3 numbers and which among these three is greatest
import java.util.Scanner;

class test14{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter factorial number");
    int factorial = sc.nextInt();
   
    for (int i=1; i<factorial; i++)

    {
    factorial = factorial*i    
 } 
}
}