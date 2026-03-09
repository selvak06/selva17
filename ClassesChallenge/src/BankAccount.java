public class BankAccount {
    private String customerName;
    private int accountNumber;
    private double accountBalance;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("Selva1", 123451, 1001.00, "abc1@abc.com", "123-456-7891");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, int accountNumber, double accountBalance, String custEmail,String custPhoneNumber) {
        System.out.println("Account constructor called");
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        email = custEmail;
        phoneNumber = custPhoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("Selva2", 123452, 2001.00, "abc2@abc.com", "123-456-7892");
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName= customerName;
    }
    public void depositFunds(double depositAmount,int accountNumber) {
        setAccountNumber(accountNumber);
        if (depositAmount !=0) {
            accountBalance+=depositAmount;
        }
        System.out.println("The new balance for " + accountNumber + "is :" + accountBalance);
    }

    public void withdrawFunds(double withdrawAmount,int accountNumber) {
        setAccountNumber(accountNumber);
        if (accountBalance - withdrawAmount < 0) {
            System.out.println("Insufficient funds in your account " + accountNumber);
        } else {
            accountBalance -= withdrawAmount;
            System.out.println("The new balance for " + accountNumber + " is :" + accountBalance);
        }
    }
}
