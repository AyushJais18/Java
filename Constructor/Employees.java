public class Employees {
    int Emp_Id;
    String Name;

    Employees(int eid, String ename){
        this.Emp_Id = eid;
        this.Name = ename;
    }

    void DisplayProfile(){
        System.out.println("Emp_Id : " + Emp_Id);
        System.out.println("Name : " + Name);
    }

    public static void main(String[] args){
        Employees t1 = new Employees(101,"Purvi");
        t1.DisplayProfile();

        Employees t2 = new Employees(102,"Shuryansh");
        t2.DisplayProfile();
    }

}