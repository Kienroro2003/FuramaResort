package utils;

import entities.*;

import java.util.Scanner;

public class InputHelper {
    public static final Scanner scanner = new Scanner(System.in);

    // --- 1. PHƯƠNG THỨC CHUNG ĐỂ CHỌN ENUM ---
    // Phương thức này dùng chung cho tất cả các loại Enum như Gender, Level, Position...
    public static <T extends Enum<T>> T inputEnum(String label, T[] values) {
        System.out.println("--- Select " + label + " ---");
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%d. %s%n", i + 1, values[i].name());
        }

        while (true) {
            try {
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice > 0 && choice <= values.length) {
                    return values[choice - 1];
                }
                System.err.printf("Invalid choice! Please choose between 1 to %d: ", values.length);
            } catch (NumberFormatException e) {
                System.err.print("Please enter a valid number: ");
            }
        }
    }

    // --- 2. CÁC PHƯƠNG THỨC INPUT (Tạo mới) ---

    private static void inputPersonFields(Person person) {
        System.out.print("Enter full name: ");
        person.setFullName(scanner.nextLine());

        person.setGender(inputEnum("Gender", Gender.values()));

        System.out.print("Enter birthdate: ");
        person.setDateOfBirth(scanner.nextLine());
        System.out.print("Enter phone number: ");
        person.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter email: ");
        person.setEmail(scanner.nextLine());
        System.out.print("Enter ID card: ");
        person.setIdCard(scanner.nextLine());
    }

    public static void input(Customer customer) {
        inputPersonFields(customer);
        System.out.print("Do you want to update customer type? [%s] (y/n): ".formatted(customer.getCustomerType().name()));
        if (scanner.nextLine().equalsIgnoreCase("y"))
            customer.setCustomerType(inputEnum("Customer Type", CustomerType.values()));
        System.out.print("Enter customer address: ");
        customer.setAddress(scanner.nextLine());
    }

    public static void input(Employee employee) {
        inputPersonFields(employee);
        employee.setLevel(inputEnum("Level", Level.values()));
        employee.setPosition(inputEnum("Position", Position.values()));
        System.out.print("Enter customer salary: ");
        employee.setSalary(Double.parseDouble(scanner.nextLine()));
    }

    // --- 3. CÁC PHƯƠNG THỨC UPDATE (Cập nhật - Nhấn Enter để giữ nguyên cũ) ---

    private static void update(Person person) {
        person.setFullName(updateField("full name", person.getFullName()));

        // Cập nhật Gender (có thể mở rộng thêm logic nếu muốn bỏ qua update Enum)
        System.out.println("Current Gender: " + person.getGender());
        System.out.print("Do you want to update gender? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            person.setGender(inputEnum("Gender", Gender.values()));
        }

        person.setDateOfBirth(updateField("birthday", person.getDateOfBirth()));
        person.setPhoneNumber(updateField("phone number", person.getPhoneNumber()));
        person.setEmail(updateField("email", person.getEmail()));
        person.setIdCard(updateField("id card", person.getIdCard()));
    }

    public static void update(Customer customer) {
        update((Person) customer);

        System.out.println("Current Customer Type: " + customer.getCustomerType());
        System.out.print("Do you want to update type? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            customer.setCustomerType(inputEnum("Customer Type", CustomerType.values()));
        }

        customer.setAddress(updateField("address", customer.getAddress()));
    }

    public static void update(Employee employee) {
        update((Person) employee);

        System.out.println("Current Employee Level: " + employee.getLevel());
        System.out.print("Do you want to update type? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            employee.setLevel(inputEnum("Level", Level.values()));
        }

        System.out.println("Current Employee Position: " + employee.getPosition());
        System.out.print("Do you want to update type? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            employee.setPosition(inputEnum("Position", Position.values()));
        }

        employee.setSalary(Double.parseDouble(updateField("salary", "" + employee.getSalary())));


    }

    // --- 4. HELPER METHODS ---

    private static String updateField(String label, String oldValue) {
        System.out.printf("Enter %s [%s]: ", label, oldValue);
        String input = scanner.nextLine();
        return input.isEmpty() ? oldValue : input;
    }
}