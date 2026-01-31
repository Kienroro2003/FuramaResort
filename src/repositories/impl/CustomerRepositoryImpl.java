package repositories.impl;

import entities.Customer;
import entities.CustomerType;
import entities.Gender;
import repositories.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private final List<Customer> customers;

    public CustomerRepositoryImpl() {
        this.customers = new ArrayList<>();
        customers.add(new Customer("Nguyễn Văn A", "15/05/1990", Gender.MALE, "012345678", "0905123456", "nguyenvana@gmail.com", CustomerType.DIAMOND, "123 Phan Chu Trinh, Đà Nẵng"));
        customers.add(new Customer("Trần Thị B", "20/10/1995", Gender.FEMALE, "023456789", "0914223344", "tranthib@hotmail.com", CustomerType.PLATINUM, "45 Lê Lợi, Hà Nội"));
        customers.add(new Customer("Lê Hoàng C", "02/02/1988", Gender.MALE, "034567890", "0988667788", "lehoangc@yahoo.com", CustomerType.GOLD, "78 Nguyễn Huệ, TP. HCM"));
        customers.add(new Customer("Phạm Minh D", "12/12/2000", Gender.MALE, "045678901", "0901002003", "phadminhd@outlook.com", CustomerType.SILVER, "12 Trần Hưng Đạo, Cần Thơ"));
        customers.add(new Customer("Hoàng Lan E", "25/08/1998", Gender.FEMALE, "056789012", "0935112233", "hoanglane@gmail.com", CustomerType.MEMBER, "09 Võ Nguyên Giáp, Đà Nẵng"));
    }

    @Override
    public void add(Customer e) {
        this.customers.add(e);

    }

    @Override
    public void remove(Customer e) {
        customers.remove(e);
    }

    @Override
    public List<Customer> getAll() {
        return this.customers;
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer : this.customers) {
            if (customer.getId() == id)
                return customer;
        }
        return null;
    }
}
