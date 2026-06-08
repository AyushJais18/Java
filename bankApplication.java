import java.util.Scanner;

public class bankApplication{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        bankAccount ct1 = new bankAccount();
        System.out.println("please enter the Account Number");
        int accNo = s.nextInt();

        System.out.println("please enter the Account Holder Name");
        String name = s.next();

        System.out.println("Enter the initial balance");
        double balance = s.nextDouble();

        ct1.createAccount(accNo, name , balance);

        int choice;

        System.out.println("==============Bank Details===============");
        System.out.println("1. Amount Deposit");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. View Customer Details");
        System.out.println("4. Check Current Balance");
        System.out.println("5. Exit");

        choice = s.nextInt();
        switch (choice) {
            case 1: 
            System.out.println("Amount Deposit");
            double amount = s.nextDouble();
            ct1.amountDeposit(amount);
            break;

            case 2: 
            System.out.println("Amount Withdraw");
            double amounts = s.nextDouble();
            ct1.amountWithdraw(amounts);
            break;

            case 3:
                System.out.println("customer Details");
                ct1.customerDetails();
                break;

            case 4: 
                System.out.println("Check Current Balance");
                ct1.checkBalance();
                break;

            case 5: 
                System.out.println("Thank you for banking with us!");
                break;
            


            default: System.out.println(" Invalid");
                break;
        }
    }
}