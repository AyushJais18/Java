// class shape abstract class abstract method area and reactangle and circle extends shape then find area of both  

abstract class shape{
    abstract void area();
}

class reactangle extends shape{
    int l, b;

    reactangle(int l, int b){
        this.l = l;
        this.b = b;
    }

    
    void area(){
        System.out.println(l * b);
    }
}

class circle extends shape{
    int r;

    circle(int r){
        this.r = r;
    }

    
    void area(){
        System.out.println(3.14 * r * r);
    }
}

public class Ex5 {
    public static void main(String[] args) {
        reactangle r = new reactangle(20, 30);
        r.area();

        circle c = new circle(40);
        c.area();
    }
}

