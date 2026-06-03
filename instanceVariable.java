public class instanceVariable {
    int a = 50024 ;
    int b = 3563 ;
    int c ;

    void sum(){
        c = a + b;
        System.out.println("Sum :" + c);
    }

    public static void main(String[] args){
        instanceVariable t = new instanceVariable();
        t.sum();
    }
}
