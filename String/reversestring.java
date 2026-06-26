import java.util.Scanner;

public class reversestring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the String to Reverse");

        String name = sc.next();
        System.out.println("Original Name" + name);
        String rev = " ";
        for(int i = name.length - 1; i>= 0 ; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println("rev string" + rev);


    }
}

