package repositories.impl;

import entities.Employee;
import entities.Gender;
import entities.Level;
import entities.Position;
import repositories.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private List<Employee> employees;

    public EmployeeRepositoryImpl() {
        this.employees = new ArrayList<>();
        employees.add(new Employee("Nguyễn Minh Triết", "10/03/1985", Gender.MALE, "191234567", "0905111222", "triet.nguyen@company.com", Level.POSTGRADUATE, Position.DIRECTOR, 5000.0));
        employees.add(new Employee("Lê Thị Hồng Hạnh", "22/07/1992", Gender.FEMALE, "191555666", "0914333444", "hanh.le@company.com", Level.UNDERGRADUATE, Position.MANAGER, 3000.0));
        employees.add(new Employee("Phạm Hoàng Nam", "05/11/1998", Gender.MALE, "191888999", "0988000111", "nam.pham@company.com", Level.COLLEGE, Position.SPECIALIST, 1500.0));
        employees.add(new Employee("Vũ Thu Thảo", "15/01/2001", Gender.FEMALE, "191333222", "0935999888", "thao.vu@company.com", Level.INTERMEDIATE, Position.RECEPTIONIST, 800.0));
        employees.add(new Employee("Đặng Văn Lâm", "30/05/1995", Gender.MALE, "191444777", "0906777888", "lam.dang@company.com", Level.UNDERGRADUATE, Position.SUPERVISOR, 2200.0));
    }

    @Override
    public void add(Employee e) {
        this.employees.add(e);

    }

    @Override
    public void remove(Employee e) {
        this.employees.remove(e);

    }

    @Override
    public List<Employee> getAll() {
        return this.employees;
    }

    @Override
    public Employee findById(int id) {
        return employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
    }
}