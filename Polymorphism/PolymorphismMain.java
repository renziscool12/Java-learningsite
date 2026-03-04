import java.util.*;

public class MainPolyInheri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
        Employee emp = employeeSalary(sc); // Cal the method to get employee details and calculate salary using object
                                           // with polymorphism

        if (emp != null) { // Check if the employee object is not null before accessing its properties
            System.out.println("Employee: " + emp.getName());
            System.out.println("Salary: " + emp.calculateSalary());
        }
    }

    // Method to create an Employee object based on user input and calculate salary
    // using polymorphism
    public static Employee employeeSalary(Scanner sc) {
        Employee emp = null; // Initialize the Employee object to null

        System.out.print("Enter employee type(FullTime / Partime): ");
        String type = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        if (type.equalsIgnoreCase("fulltime")) { // Check if the employee type is full case or not
            System.out.print("Enter base Salary: ");
            double base = sc.nextDouble();

            System.out.print("Enter bonus: ");
            double bonus = sc.nextDouble();

            sc.nextLine(); // Consume the newline char left by nextDouble()

            emp = new FullTimeEmployee(name, base, bonus); // Save the employee details in the object of
                                                           // FullTimeEmployee class
        } else if (type.equalsIgnoreCase("parttime")) { // Check iif the parttime case or not
            System.out.print("Enter hours worked: ");
            double hoursWorked = sc.nextDouble();

            System.out.print("Enter hourly rate: ");
            double hourlyRate = sc.nextDouble();

            sc.nextLine();

            emp = new PartTimeEmployee(name, hoursWorked, hourlyRate); // Savee the employee details in the object of
                                                                       // PartTimeEmployee class
        } else {
            if (type == null || type.isEmpty()) { // Check if the employee type is null or empty and print invalid
                                                  // message
                System.out.println("Invalid!");
                return null;
            }
        }
        return emp; // return the created Employee object (either FullTimeEmployee or
                    // PartTimeEmployee) to the caller
    }
}

// NOTES:

// 1. Always put method calculateSalary() in parent class and override it in
// child class to calculate salary based on employee type using polymorphism.

// 2. Use null for the Employee object in the employeeSalary method to handle
// cases where the employee type is invalid and return null to indicate that no
// valid employee was created. This allows the main method to check for null
// before trying to access properties of the Employee object, preventing
// potential NullPointerExceptions.

// 3. Use equalsIgnoreCase() to compare the employee type input with "fulltime"
