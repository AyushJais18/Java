class Student {
    private String name;
    private int rollNo;

    public void setName(String Name){
        this.name = Name; 
    }

    public String getName(){
        return this.name;
        }

    public void setRollNo(int rollNo){
        if (rollNo > 0) {
    this.rollNo = rollNo;
} else {
    throw new IllegalArgumentException("Invalid Data");
}
    }

    public int getRollNo(){
        return this.rollNo;
    }

    public class EncEx1{
        public static void main(String[] args){
            Student s = new Student();
            s.setName("Ayush");
            s.setRollNo(1);

            System.out.println("Name: " + s.getName());
            System.out.println("Roll No: " + s.getRollNo());  
        }
    }
    
}