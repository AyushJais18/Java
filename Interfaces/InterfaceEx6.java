// Nested Interface 

class College {
    interface Sunstone {
        void softwareTraining();
    }
}

class Sage implements College.Sunstone{
    @Override
    public void softwareTraining(){
        System.out.println("Provide Fullstack Training");
    }
}

public class InterfaceEx6{
    public static void main(String[] args) {
        Sage s = new Sage();
        s.softwareTraining();    
    }   
}