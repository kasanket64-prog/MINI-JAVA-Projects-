

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

class EmployeeManager {
    ArrayList<Employee> employees = new ArrayList<>();

    void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Employee added successfully!");
    }

    void displayAll() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("---- Employee List ----");
            for (Employee e : employees) {
                e.display();
            }
        }
    }

    void searchById(int id) {
        for (Employee e : employees) {
            if (e.id == id) {
                System.out.println("Employee found:");
                e.display();
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}

public class EmployeeProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    manager.addEmployee(new Employee(id, name, salary));
                    break;
                case 2:
                    manager.displayAll();
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    manager.searchById(searchId);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

