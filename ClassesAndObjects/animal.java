public class animal {
    String Name;
    String Breed;
    String Color;

    void appearance(String Name, String Breed, String Color) {
        this.Name = Name;
        this.Breed = Breed;
        this.Color = Color;
    }

    void display() {
        System.out.println("Name: " + Name);
        System.out.println("Breed: " + Breed);
        System.out.println("Color: " + Color);
    }

    void run() {
        System.out.println("Animal is running");
    }

    public static void main(String[] args) {
        animal t = new animal();

        t.appearance("Tuffy", "Husky", "Black and White");

        t.display();
        t.run();
    }
}