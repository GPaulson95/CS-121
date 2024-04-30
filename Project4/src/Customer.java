import java.util.ArrayList;
public class Customer {
    //instance variables
    private String firstName;
    private String lastName;
    private int pin;
    private ArrayList<Account> accountArrayList = new ArrayList<>();
    //constructor
    public Customer(String firstName, String lastName, int pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }
    //getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getPin(){
        return pin;
    }
    public ArrayList<Account> getAccountArrayList() {
        return accountArrayList;
    }
    public void addAccount(Account account){
        accountArrayList.add(account);
    }
    public void removeAccount(Account account){
        accountArrayList.remove(account);
    }
    public Account returnSingleAccount(int accountNumber){
        Account foundAccount = null;
        for (Account account: accountArrayList) {
            if (account.getAccountNumber() == accountNumber) {
                foundAccount = account;
                break;
            }
        }
        return foundAccount;
    }

    public StringBuilder returnAllAccounts(){
        StringBuilder sb = new StringBuilder();
        for(Account account : accountArrayList){
            sb.append(toString()).append(account + "\n");
        }
        return sb;
    }
    @Override
    public String toString(){
        return String.format("\n***Customer Info***\nFirst Name: %s\nLast Name: %s\nPin: %s\n",firstName,lastName,pin);
    }

}
