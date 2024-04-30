import java.util.Scanner;
public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Bank bank = new Bank();
    boolean exit = false;

    public void runMenu(){
        while(!exit) {
            System.out.print("\n********** MENU **********");
            System.out.print("\nPlease make a selection: ");
            System.out.print("\n1) Access Account");
            System.out.print("\n2) Open a New Account");
            System.out.print("\n3) Close All Accounts");
            System.out.print("\n4) Exit\n");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    accessAccount();
                    break;
                case 2:
                    openNewAccount();
                    break;
                case 3:
                    closeAllAccounts();
                    break;
                case 4:
                    System.out.println("Thank you for using BSU Banking App, Goodbye. Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
    private void accessAccount(){
        Customer customer;
        Account account;
        System.out.println("Please enter your PIN: ");
        int pin = scanner.nextInt();
        customer = bank.getCustomer(pin);
        if(customer == null){
            System.out.println("Invalid pin");
            return;
        }
        System.out.println(customer.returnAllAccounts());
        System.out.println("Please enter the account number of the account you would like to access:");
        int accountNumber = scanner.nextInt();
        account = customer.returnSingleAccount(accountNumber);
        if(account == null){
            System.out.println("Invalid account number");
            return;

        }while(!exit) {
            System.out.print("\nPlease make a selection: ");
            System.out.print("\n1) Make a Deposit");
            System.out.print("\n2) Make a Withdrawal");
            System.out.print("\n3) See Account Balance");
            System.out.print("\n4) Create Savings Account");
            System.out.print("\n5) Close Account");
            System.out.print("\n6) Exit\n");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Enter the amount you'd like to deposit: ");
                    double amountD = scanner.nextDouble();
                    account.deposit(amountD);
                    break;
                case 2:
                    System.out.println("Enter the amount you'd like to withdraw: ");
                    double amountW = scanner.nextDouble();
                    account.withdraw(amountW);
                    break;
                case 3:
                    System.out.println("The account number: " + account.getAccountNumber());
                    System.out.println("The account balance: " + account.getBalance());
                    closeAllAccounts();
                    break;
                case 4:
                    System.out.println("Please enter an initial Deposit");
                    amountD = scanner.nextDouble();
                    Savings savings = new Savings(amountD);
                    customer.addAccount(savings);
                    System.out.printf("New savings account opened, account number: #%d",savings.getAccountNumber());
                    break;
                case 5:
                    customer.removeAccount(account);
                    System.out.println("Account #" + account.getAccountNumber() + " is now closed.");
                    break;
                case 6:
                    System.out.println("Thank you for using BSU Banking App, Goodbye. Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

    }
    private void openNewAccount() {
        System.out.println("Are you a new customer? (Yes or No)");
        String userInput = scanner.next().toLowerCase();
        Customer customer;
        switch (userInput) {
            case "yes":
                customer = createNewCustomer();
                System.out.println("Please enter an initial deposit amount: ");
                double initialDeposit = scanner.nextDouble();
                Account account = new Account(initialDeposit);
                customer.addAccount(account);
                System.out.printf("New account opened, account number #%d",account.getAccountNumber());
                break;
            case "no":
                System.out.println("Please enter your PIN");
                int pin = scanner.nextInt();
                customer = bank.getCustomer(pin);
                if(customer == null){
                    System.out.println("Invalid pin");
                    return;
                }
                else{
                    System.out.println(customer);
                }
                break;
            default:
                System.out.println("Invalid input");
                openNewAccount();
                break;
        }
    }
    private Customer createNewCustomer(){
        String firstName;
        String lastName;
        System.out.println("Welcome, please enter your first name: ");
        firstName = scanner.next();
        System.out.println("Please enter your last name: ");
        lastName = scanner.next();
        System.out.println("Please create a 4-digit pin: ");
        int  pin = scanner.nextInt();
        Customer customer = new Customer(firstName,lastName,pin);
        bank.addCustomer(customer);
        return customer;
    }
    private void closeAllAccounts(){
        Customer customer;
        System.out.println("Please enter your PIN");
        int pin = scanner.nextInt();
        customer = bank.getCustomer(pin);
        if(customer == null) {
            System.out.println("Invalid Pin");
        }
        else{
            bank.removeCustomer(customer);
            System.out.println("You have been removed from the bank registry");
        }
    }
}
