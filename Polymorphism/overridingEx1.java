// overriding is that concept in which there will be further implementation of a particular method inside a child class of any particular parent class.

// method signature should be always same of any method in parent class as well as child class

class Animal {
    void sound(){
        System.out.println("Animal Sound differently");
    }

}

public class overridingEx1 extends Animal {
    void sound(){
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        overridingEx1 t = new overridingEx1();
        t.sound();
    }
}