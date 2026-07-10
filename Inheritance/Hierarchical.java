package Inheritance;

class HierarchicalParent {

    void parentMethod() {
        System.out.println("This is Parent class method");
    }
}

class HierarchicalChild1 extends HierarchicalParent {

    void child1Method() {
        System.out.println("This is Child1 class method");
    }
}

class HierarchicalChild2 extends HierarchicalParent {

    void child2Method() {
        System.out.println("This is Child2 class method");
    }
}

public class Hierarchical {

    public static void main(String[] args) {

        HierarchicalChild1 obj1 = new HierarchicalChild1();
        System.out.println("Using Child1 Object:");
        obj1.parentMethod();
        obj1.child1Method();

        System.out.println();

        HierarchicalChild2 obj2 = new HierarchicalChild2();
        System.out.println("Using Child2 Object:");
        obj2.parentMethod();
        obj2.child2Method();
    }
}