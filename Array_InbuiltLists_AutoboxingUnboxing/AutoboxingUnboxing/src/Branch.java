import java.util.ArrayList;

public class Branch {
    /*
    * Add new customer
    * Add additional transactions to that customer
    * */
    private ArrayList<Customer> customers;
    private String branchName;

    public Branch(String branchName) {
        this.customers = new ArrayList<>();
        this.branchName = branchName;
    }

    private int getNumberOfCustomers() {
        return this.customers.size();
    }

    private int checkCustomer(Customer customer) {
        for (int i = 0; i < customers.size(); ++i) {
            // returns the index of the existing customer, if found
            if (customers.get(i).getName().equals(customer.getName())) {
                return i;
            }
        }
        // if customer is not found, returns -1
        return -1;
    }

    public boolean addCustomer(Customer customer) {
        // checking if the customer already exists
        if (checkCustomer(customer) != -1) {
            return false;
        }

        customers.add(customer);
        return true;
    }

    public void showTransactions(Customer c) {
        int index = checkCustomer(c);
        if (index != -1) {
            System.out.println("Transactions for Customer " + c.getName() + " =>");
            ArrayList<Double> transactions = customers.get(index).getTransactions();
            if (transactions.size() == 0) {
                System.out.println("\nNO TRANSACTIONS AVAILABLE\n");
                return;
            }
            for (Double t: transactions) {
                System.out.format("\t%.2f\n", t.doubleValue());
            }
            return;
        }
        System.out.println("CUSTOMER NOT FOUND!!");
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean addTransaction(Customer customer, double transaction) {
        int index = checkCustomer(customer);
        if (index != -1) {
            Customer currentCustomer = customers.get(index);
            if (currentCustomer.getBalance() + transaction < 0) {
                return false;
            }

            return currentCustomer.addTransaction(transaction);
        }
        return false;
    }

    public String getBranchName() {
        return branchName;
    }
}
