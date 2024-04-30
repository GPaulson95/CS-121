//
public class Savings extends Account {
    public Savings(double deposit) {
        super(deposit);

    }

    @Override
    public void withdraw(double withdrawal){
        if (getBalance() - withdrawal > 0){
            double balance = getBalance() - withdrawal;
            System.out.printf("\nBalance: $%.2f\n",balance);
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }
}
