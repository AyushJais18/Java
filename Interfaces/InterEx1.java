interface it1{

    void m1();

    void m2();

    void m3();
}

class tee implements it1{
    // by default they are public method in interface the methods
    public void m1(){
        System.out.println("This is m1 method");
    }
    public void m2(){
        System.out.println("This is m2 method");
    }
    public void m3(){
        System.out.println("This is m3 method");
    }
}

public class InterEx1 {
    public static void main(String[] args){
        tee t = new tee();
        t.m1();
        t.m2();
        t.m3();
    }
}
