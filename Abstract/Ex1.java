abstract class AbstractEx{
    abstract int m1();
    abstract boolean m2();
    void m3(){
        System.out.println("This is m3");
    }
}

public class Ex1 extends AbstractEx {
    @Override
    int m1(){
        System.out.println("This is m1");
        return 0;
    }
    @Override
    boolean m2(){
        System.out.println("This is m2");
        return false;
    }
    public static void main(String[] args){
        Ex1 e1 = new Ex1();
        e1.m1();
        e1.m2();
        e1.m3();
    }
}

