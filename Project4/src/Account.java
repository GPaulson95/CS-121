public class Account {
    //instance variables
    private double balance;
    private static int numberOfAccounts = 1000;
    private int accountNumber;

    public Account(double initialDeposit){
        this.balance = initialDeposit;
        this.accountNumber = Account.numberOfAccounts++;


    }
    public int getAccountNumber() {

        return accountNumber;
    }
    public double getBalance(){

        return balance;
    }
    public void deposit(double deposit) {
        balance = balance + deposit;
        System.out.printf("\nBalance: $%.2f\n", balance);
    }
    public void withdraw(double withdrawal){
        while(true) {
            if (withdrawal < balance) {
                balance = balance - withdrawal;
                System.out.printf("\nBalance: $%.2f\n", balance);
                break;
            } else {
                System.out.println("Insufficient Funds");
            }
        }
    }
    @Override
    public String toString(){
        return String.format("Account Number: %d\nBalance: $%.2f",accountNumber,balance);
    }
}