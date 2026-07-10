public class Test16 {
    int a = 5 ;
    int b = 4 ;
    
    void m1(){
        this.m2();
        System.out.println("m1 method");
    }

    void m2(){
        System.out.println("m2 method");
    }

    public static void main(String[] args){
        Test16 t = new Test16();
        t.m1();
    }
}
