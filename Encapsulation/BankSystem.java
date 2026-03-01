public class Encapsulation {
    // Private Fields
    private final String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public Encapsulation(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter - Read Only
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter - can change
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Methods - With validations
    public double deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Deposit must be positive!");
            return balance;
        }

        return balance += amount;
    }

    public double withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Withdraw must be positive!");
            return balance;
        }
        return balance -= amount;
    }
    // NOTE: Use static if you want the value to be shared across all instances of the class
}
