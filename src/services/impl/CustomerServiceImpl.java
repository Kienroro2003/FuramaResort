package services.impl;

import entities.Customer;
import repositories.CustomerRepository;
import repositories.impl.CustomerRepositoryImpl;
import services.CustomerService;
import utils.InputHelper;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository repository;

    public CustomerServiceImpl() {
        this.repository = new CustomerRepositoryImpl();
    }

    @Override
    public void add() {
        Customer customer = new Customer();
        InputHelper.input(customer);
        repository.add(customer);
    }


    @Override
    public void update() {
        Scanner scanner = InputHelper.scanner;
        System.out.println("Enter your customer id: ");
        Customer customer = repository.findById(Integer.parseInt(scanner.nextLine()));
        InputHelper.update(customer);
        System.out.println(customer);
    }

    @Override
    public void display() {
        System.out.println(Arrays.toString(this.repository.getAll().toArray()));
    }
}
