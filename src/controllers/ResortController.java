package controllers;

import services.CustomerService;
import services.EmployeeService;
import services.impl.CustomerServiceImpl;
import services.impl.EmployeeServiceImpl;
import utils.InputHelper;

import java.util.Scanner;

public class ResortController {
    private static final int NUMBER_ASTERISK = 40;
    private static final Scanner sc = InputHelper.scanner;
    private static CustomerService customerService = new CustomerServiceImpl();
    private static EmployeeService employeeService = new EmployeeServiceImpl();

    public static void displayMainMenu() {
        while (true) {
            System.out.println("""
                    %s
                    1. Employee Management
                    2. Customer Management
                    3. Facility Management
                    4. Booking Management
                    5. Promotion Management
                    6. Exit
                    %s""".formatted("*".repeat(NUMBER_ASTERISK), "*".repeat(NUMBER_ASTERISK)));
            System.out.print("Enter your choice : ");
            try {
                int myChoice = Integer.parseInt(sc.nextLine());
                switch (myChoice) {
                    case 1:
                        displayEmployeeMenu();
                        break;
                    case 2:
                        displayCustomerMenu();
                        break;
                    case 3:
                        displayFacilityMenu();
                        break;
                    case 4:
                        displayBookingMenu();
                        break;
                    case 5:
                        displayPromotionMenu();
                        break;
                    case 6:
                        System.out.println("Your system is being closed.");
                        return;
                    default:
                        System.out.println("Invalid choice. Your choice must be a positive integer between 1 and 6.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid choice. Your choice must be a integer.");
            }
        }

    }

    private static void displayEmployeeMenu() {
        while (true) {
            System.out.println("""
                    1. Display list employees
                    2. Add new employee
                    3. Edit employee
                    4. Return main menu""");
            System.out.print("Enter your choice : ");
            try {
                int myChoice = Integer.parseInt(sc.nextLine());
                switch (myChoice) {
                    case 1:
                        employeeService.display();
                        break;
                    case 2:
                        employeeService.add();
                        break;
                    case 3:
                        employeeService.update();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid choice. Your choice must be a integer between 1 and 4.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid choice. Your choice must be a integer.");
            }
        }
    }

    private static void displayCustomerMenu() {
        while (true) {
            System.out.println("""
                    1. Display list customers
                    2. Add new customer
                    3. Edit customer
                    4. Return main menu""");
            try {
                System.out.print("Enter your choice : ");
                int myChoice = Integer.parseInt(sc.nextLine());
                switch (myChoice) {
                    case 1:
                        customerService.display();
                        break;
                    case 2:
                        customerService.add();
                        break;
                    case 3:
                        customerService.update();
                        break;
                    case 4:
                        System.out.println("Return main menu");
                        return;
                    default:
                        System.out.println("Invalid choice.  Your choice must be a integer between 1 and 4.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid choice. Your choice must be a integer.");
            }
        }
    }

    private static void displayFacilityMenu() {
        while (true) {
            System.out.println("""
                    1. Display list facilities
                    2. Add new facility
                    3. Display list facilities maintenance
                    4. Return main menu""");
            try {
                System.out.print("Enter your choice : ");
                int myChoice = Integer.parseInt(sc.nextLine());
                switch (myChoice) {
                    case 1:
                        System.out.println("Display list facilities");
                        break;
                    case 2:
                        System.out.println("Add new facility");
                        break;
                    case 3:
                        System.out.println("Display list facilities maintenance");
                        break;
                    case 4:
                        System.out.println("Return main menu");
                        return;
                    default:
                        System.out.println("Invalid choice. Your choice must be a integer between 1 and 4.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid choice. Your choice must be a integer.");
            }
        }
    }

    private static void displayBookingMenu() {
        while (true) {
            System.out.println("""
                    1. Add new booking
                    2. Display list bookings
                    3. Create new contracts
                    4. Display list contracts
                    5. Edit contract
                    6. Return main menu""");
            try {
                System.out.print("Enter your choice : ");
                int myChoice = Integer.parseInt(sc.nextLine());
                switch (myChoice) {
                    case 1:
                        System.out.println("Add new booking");
                        break;
                    case 2:
                        System.out.println("Display list bookings");
                        break;
                    case 3:
                        System.out.println("Create new contract");
                        break;
                    case 4:
                        System.out.println("Display list contracts");
                        break;
                    case 5:
                        System.out.println("Edit contract");
                        break;
                    case 6:
                        System.out.println("Return main menu");
                        return;
                    default:
                        System.out.println("Invalid choice. Your choice must be a integer between 1 and 6.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid choice. Your choice must be a integer.");
            }
        }
    }

    private static void displayPromotionMenu() {
        while (true) {
            try {
                System.out.println("""
                        1. Display list customers use service
                        2. Display list customers get voucher
                        3. Return main menu""");
                System.out.print("Enter your choice : ");
                int myChoice = Integer.parseInt(sc.nextLine());
                switch (myChoice) {
                    case 1:
                        System.out.println("Display list customers use service");
                        break;
                    case 2:
                        System.out.println("Display list customers get voucher");
                        break;
                    case 3:
                        System.out.println("Return main menu");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }catch (NumberFormatException ex) {
                System.out.println("Invalid choice. Your choice must be a integer.");
            }
        }
    }

}
