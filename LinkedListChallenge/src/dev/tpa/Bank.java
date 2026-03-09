package dev.tpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Bank {
    private String name;
    private ArrayList<Branch > branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {

        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double transactionAmount) {
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transactionAmount) {
        return false;
    }

    private Branch findBranch(String nameOfBranch) {

        for (Branch checkedBranch : branches) {
            if (checkedBranch.getTitle().equals(title)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransaction) {
        return false;
    }

}
