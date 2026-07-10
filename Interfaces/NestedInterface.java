interface Employees {
    interface dpt{
        void EmployeesProfile();
    }
}

class EmployeeDetails implements Employees.dpt{
    public void EmployeesProfile(){
        System.out.println("Name : Tanya Jain");
    }
}

public class NestedInterface{
    public static void main(String[] args){
        EmployeeDetails ED = new EmployeeDetails();
        ED.EmployeesProfile();    
    }
}