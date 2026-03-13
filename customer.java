public class customer {
    private int customerId;
    private String customerName;
    private boolean CustomerGender;

    public customer() {
        this.customerId = 101;
        this.customerName = "John Doe";
        this.CustomerGender = true;
    }

    public String getName() {
        return customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public boolean isCustomerGender() {
        return CustomerGender;
    }
}