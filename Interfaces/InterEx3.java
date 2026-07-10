interface teacher{
    void study();
    
}

abstract class  student implements teacher{
    abstract void m1();
    void library(){
        System.out.println("Library");
    }   
    
}

class library extends student{
    public void m1()
    {
        System.out.println("study");
    }
    public void study(){
        System.out.println("library");
    }
}

public class InterEx3{
    public static void main(String[] args){
        student t = new library();
        t.m1();
        t.study();
    }
}