class MultiGrandParent {
    void grandparentMethod(){
        System.out.println("This is grand parent method");
    }
}

class MultiParent extends MultiGrandParent {
    void parentMethod(){
        System.out.println("This is parent method");
    }
}

class MultiChild extends MultiParent {
    void childMethod(){
        System.out.println("This is Child method");
    }
}

public class Multiplelevel{
    public static void main(String[] args) {
        
        MultiChild obj = new MultiChild();

        obj.grandparentMethod();

        obj.parentMethod();

        obj.childMethod();

    }
}