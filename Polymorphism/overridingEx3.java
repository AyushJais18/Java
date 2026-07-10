class OverridingEx3Parent {
    void sound(){
        System.out.println("Parent Class");
    }
}

class OverridingEx3Child extends OverridingEx3Parent {
    void sound(){
        super.sound();
        System.out.println("child Class");
    }
}

public class overridingEx3 {
    public static void main(String[] args) {
        OverridingEx3Child t = new OverridingEx3Child();
        t.sound();
    }
}