class test{

    void name(){
        System.out.println("Ms.Shalini");
    }
    
}

public class finalConc extends test {

    void name(){
        System.out.println("Mrs Shalini");
    }
    public static void main(String[] args) {
       finalConc t = new finalConc();
       t.name();
    }
}