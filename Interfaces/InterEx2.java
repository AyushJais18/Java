interface Animal {
    void sound();
}

abstract class ree implements Animal {
    abstract void eat();

    void sleep(){
        System.out.println("zzzzzzzzz");
    }
}


class cat extends ree{
    public void sound(){
        System.out.println("meow meow ");
    }
    public void eat(){
        System.out.println("fish");
    }

}

public class InterEx2{
    public static void main(String[] args){
        cat c = new cat();
        c.sound();
        c.eat();
        c.sleep();
    }
}