// Method chaining 

public class test20 {
    void m1(){
        m2();
        System.out.println("m1");
    }
    void m2(){
        m3();
        System.out.println("m2");
    }

    void m3(){

        System.out.println("m3");
    }

    public static void main(String args[]){
        test20 t1 = new test20();
        t1.m1();
        t1.m2();
    }
}
