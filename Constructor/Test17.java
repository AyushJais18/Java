public class Test17 {
    Test17(){
        this(10);
        System.out.println("Zero Argument Constructor");
    }

    Test17(int a){
        this(100,200);
        System.out.println("One argument Constructor");
        System.out.println(a);
    }

    Test17(int a,int b){
        System.out.println("Two argument Constructor");
        System.out.println(a);
        System.out.println(b);
    }


    public static void main(String[] args){
        Test17 t = new Test17();
    }
}
