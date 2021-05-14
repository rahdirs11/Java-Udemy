import java.util.ArrayList;

public class Bank {
    /*
    * Add new branch
    * Add customer to that branch
    * Show list of customers for a particular branch
    * */
    ArrayList<Branch> branches;
    public ArrayList<Branch> getBranches() {
        return this.branches;
    }

    private int getNumberOfBranches() {
        return this.branches.size();
    }

    public int checkBranch(Branch b) {
        int index = 0;
        while (index < getNumberOfBranches()) {
            if (branches.get(index).getBranchName().equals(b.getBranchName())) {
                return index;
            }
            ++index;
        }
        return -1;
    }

    public boolean addCustomer(Branch b, Customer c) {
        int index = checkBranch(b);
        if (index != -1) {
            Branch currentBranch = getBranches().get(index);
            return currentBranch.addCustomer(c);
        }
        return false;
    }

    public boolean addBranch(Branch b) {
        int index = checkBranch(b);
        if (index != -1) {
            return false;
        }

        this.branches.add(b);
        return true;
    }
}
