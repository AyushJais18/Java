// write a java program to create an interface shape with the getArea() method. create three classes ractangle ,circle,  and triangle that implement the shape interface. implement the getArea() method for each of the three classes.

interface Shape {
    void getArea();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void getArea() {
        System.out.println("Area of Rectangle: " + (width * height));
    }   
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void getArea() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void getArea() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

public class InterEx4 {
    public static void main(String[] args) {
        Shape r = new Rectangle(5.0, 4.0);
        Shape c = new Circle(3.0);
        Shape t = new Triangle(4.0, 6.0);
        
        r.getArea();
        c.getArea();
        t.getArea();
    }
}