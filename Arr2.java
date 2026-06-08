import java.util.Scanner;

public class Arr2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Pls enter the Element of an array");
        for(int i = 0 ; i< size ; i++){
            a[i] = s.nextInt();
        }
        for(int i=0 ; i<size ; i++){
            System.out.print("Elements of array"+a[i]);
        }
    }
    
}
