package bank;

public class BankAccount {
    private double balance = 0;
    public String name;

    public BankAccount(String name) {
        this.name = name;
    }

    public void setBalance(double amount) {
        if (amount < 0) {
            System.out.println("You are not allowed to set negative amount for the balance");
        } else {
            this.balance = amount;
        }

    }

    public double getBalance() {
        return this.balance;
    }
}
