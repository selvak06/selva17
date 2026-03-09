public class Customer {
    private String custName;
    private double creditLimit;
    private String emailAddres;

    public String getCustName() {
        return custName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddres() {
        return emailAddres;
    }

    public Customer(String custName, double creditLimit, String emailAddres) {
        this.custName = custName;
        this.creditLimit = creditLimit;
        this.emailAddres = emailAddres;
        System.out.println("Full customer constructor called");
    }

    public Customer() {
       this("Bob", 2000.00, "bob@bob.com");
        System.out.println("Empty customer constructor called");
    }

    public Customer(String custName, String emailAddres) {
        this("Tom", 2000.00, "tom@tom.com");
        System.out.println("Partial customer constructor called");
    }

}
