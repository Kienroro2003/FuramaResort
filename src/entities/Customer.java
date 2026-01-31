package entities;

public class Customer extends Person {
    public static int LAST_ID = 0;
    private CustomerType customerType = CustomerType.MEMBER;
    private String address;

    public Customer() {
        setId(LAST_ID++);
    }

    public Customer(String fullName, String dateOfBirth, Gender gender, String idCard, String phoneNumber, String email, CustomerType customerType, String address) {
        super(fullName, dateOfBirth, gender, idCard, phoneNumber, email);
        setId(Customer.LAST_ID++);
        this.customerType = customerType;
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Customer customer) {
            return getId() == customer.getId();
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", customerType=" + customerType +
                ", address='" + address + '\'' + '}' + '\n';
    }
}
