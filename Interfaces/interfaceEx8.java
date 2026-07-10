interface AllMethod {
    void m1();

    default void m2(){
        System.out.println("this is default method");
        m4();
    } 
    static void m3(){
        System.out.println("this is static method");
        m5();
    }
    private void m4(){
        System.out.println("this is private method");


    }

    private static void m5(){
        System.out.println("this is private static method");
    }

    class All implements AllMethod{
        public void m1(){
            System.out.println("this is abstract method");
        }
    }

    public class InterfaceEx8{
        public static void main(String[] args){ 

        All a = new All();
        a.m1();
        a.m2();
        AllMethod.m3();
        
    }
    }
}
   