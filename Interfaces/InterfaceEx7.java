// Interface resolves Diamond problem in Multiple Inheritance 

interface Father{
    void properties();
}
interface Mother{
    void love();
}
interface Sibling{
    void fight();
}
class family implements Father,Mother,Sibling{
    public void properties(){
        System.out.println("propert() of Father");
    }
    public void love(){
        System.out.println("love() of Mother");
    }
    public void fight(){
        System.out.println("fight() of Sibling");
    }
}
public class InterfaceEx7{
    public static void main(String[] args){
        family a = new family();
        a.properties();
        a.love();
        a.fight();    
    }
}
