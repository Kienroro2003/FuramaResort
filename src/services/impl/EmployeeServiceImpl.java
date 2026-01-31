package services.impl;

import entities.Employee;
import repositories.EmployeeRepository;
import repositories.impl.EmployeeRepositoryImpl;
import services.EmployeeService;
import utils.InputHelper;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    public EmployeeServiceImpl() {
        this.employeeRepository = new EmployeeRepositoryImpl();
    }

    @Override
    public void add() {
        Employee employee = new Employee();
        InputHelper.input(employee);
        employeeRepository.add(employee);

    }


    @Override
    public void update() {
        System.out.print("Enter employee id: ");
        Employee employee = employeeRepository.findById(Integer.parseInt(InputHelper.scanner.nextLine()));
        InputHelper.update(employee);
        System.out.println(employee);

    }

    @Override
    public void display() {
        System.out.println(employeeRepository.getAll());

    }
}
