public class Test15 {
    int a = 5 ;
    int b = 4 ;
    void sum (int a, int b){
        System.out.println(a+b);
        System.out.println(this.a+this.b);
    }

    public static void main(String[] args){
        Test15 t = new Test15();
        t.sum(2,5);
    }
}
