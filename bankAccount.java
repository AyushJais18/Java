public class bankAccount {
    int accountNumber;
    String name;
    double balance;

    void createAccount(int accountNumber,String name, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void customerDetails(){
        System.out.println("Account Number : "+ accountNumber);
        System.out.println("Account Holder Name : "+ name);
        System.out.println("Current Balance : "+  balance);

    }

    void amountDeposit(double amount) {
        balance += amount;
        System.out.println("Current Balance" + balance);

    }

    void amountWithdraw(double amount){
        if(balance >= amount){
            balance -= amount ;
            System.out.println(" Current Balance");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);

}
}