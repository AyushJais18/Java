// mixVariable method
public class test22 {
    int a = 5 ;
    int b = 2 ;
    static String s = "abc";

    void sum(int i, int j){
        int x = i+j;
        System.out.println("Sum : "+ x);
    }

    void Addition(){
        int c = a+b; 
        System.out.println("Add : "+ c);
    }

    static void sub(int l, int k){
        int m = l-k;
        System.out.println("Sub : "+ m);
    }
    static void word(){
        System.out.println("word : "+s);
    }
    public static void main(String[] args){
        test22 t = new test22();
        t.sum(22, 30);
        t.Addition();
        sub(23,20);
        word();

    }
}
