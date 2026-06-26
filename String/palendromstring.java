import java.util.Scanner;

public class palendromstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the String to Reverse");

        String name = sc.next();
        System.out.println("Original Name  " + name);
        name = name.toLowerCase();
        String rev = "";
        for(int i = name.length() - 1; i>= 0 ; i--){
            rev = rev + name.charAt(i);
        }
        
        if(name.equals(rev)){
            System.out.println("Its palendrom string");
        } else {
            System.out.println("Its not palendrom string");
        }


    }
}