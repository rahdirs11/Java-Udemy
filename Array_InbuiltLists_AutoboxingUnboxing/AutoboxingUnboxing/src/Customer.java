import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;
    private double balance;

    public Customer(String name) {
        this.transactions = new ArrayList<>();
        this.name = name;
        this.balance = 0.0;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean addTransaction(double transaction) {
        if (this.getBalance() + transaction < 0) {
            return false;
        }
        this.transactions.add(transaction);
        this.balance += transaction;
        return true;
    }
}
