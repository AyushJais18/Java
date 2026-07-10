// bank class and fd interest and 2 method and 2 bank hdfc anc sbi extends bank and fd interest in hdfc 7.5 and 5

abstract class bank{
    abstract float fd();
}

class hdfc extends bank{
    float fd(){
        return 7.5f;    
    }
}

class sbi extends bank{
    float fd(){
        return 6.5f;
    }
}   

public class Ex7 {
    public static void main(String[] args){
        hdfc h = new hdfc();
        sbi s = new sbi();
        System.out.println("hdfc fd: " + h.fd());
        System.out.println("sbi fd: " + s.fd());
    }
}