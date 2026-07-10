import java.util.Scanner;
public class Arr3{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of student in class");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Please enter the percentage of student in a class");
        for(int i=0 ; i<size ; i++){
            a[i]= s.nextInt();
        }
        for(int i = 0; i<size ; i++){
            System.out.println("Percent of student : "+a[i]);
            a[i] = a[i]/size;
            System.out.println("average of class : " +a[i]);

        }

    }
}