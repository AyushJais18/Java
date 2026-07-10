class OverridingEx2Parent {
    void sound() {
        System.out.println("Parent Class");
    }
}

class OverridingEx2Child extends OverridingEx2Parent {

    @Override
    void sound() {
        System.out.println("Child Class");
    }
}

public class overridingEx2 {

    public static void main(String[] args) {

        OverridingEx2Parent t = new OverridingEx2Child();

        t.sound();
    }
}