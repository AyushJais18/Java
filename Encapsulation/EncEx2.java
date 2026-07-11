import java.util.Scanner;

class Employee {
    private String userName;
    private String passWord;

    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
    public void setpassWord(String passWord){
        this.passWord = passWord;
    }
    public String getpassWord(){
        return this.passWord;
    } 
}

public class EncEx2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter User Name: ");
        String userName = s.nextLine();
        System.out.println("Enter Password: ");
        String passWord = s.nextLine();
        Employee e1 = new Employee();
        e1.setUserName(userName);
        e1.setpassWord(passWord);

        System.out.println("User Name: " + e1.getUserName());
        System.out.println("Password: " + e1.getpassWord());
    }
}
    