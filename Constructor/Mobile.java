public class Mobile {
    Mobile(){
        this("Samsung", 20000);
    }

    Mobile(String Brand, double Price){
        System.out.println("Brand : " + Brand);
        System.out.println("Price : " + Price);
    }

    public static void main(String[] args){
        Mobile o = new Mobile();
    }
}
