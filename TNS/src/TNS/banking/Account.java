package TNS.banking;

public class Account {
    private int accountId;
    private int customerId;
    private String type;
    private double balance;

    public Account(int accountId, int customerId, String type, double balance) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.type = type;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }
}
