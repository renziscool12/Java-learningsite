public class Employee {
    // Field to store the name of the employee and base salary, with appropriate
    // access modifiers
    private String name;
    protected double baseSalary;

    // Constructor to intialize the name and base salary of the employee
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter methods to access the name and base salary of the employee
    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Method to calculate the salary of the employee, which will be overridden by
    // subclasses to provide specific implementations for full-time and part-time
    // employees
    public double calculateSalary() {
        return 0;
    }
}

// Subclass for full time employees that extends the Employee class and provides
// an implementation for
class FullTimeEmployee extends Employee {
    private double bonus; // Field to store the bonus for full time employees

    // Constructor to initialize the name, base salary, and bonus for full time
    // employees, calling the superclass constructor to set the name and base salary
    public FullTimeEmployee(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    // Override the calculateSalary method to return the total salary for full time
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Subclass for part time employees that extend the Employee class and provide
// an implementation
class PartTimeEmployee extends Employee {
    // Fields to store the hours worked and hourly rate for part time employees
    private double hoursWorked;
    private double hourlyRate;

    // Constructor to initialize the name, hours worked, and hourly rate for part
    // time employees
    public PartTimeEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Override the calculateSalary method to return the total salary for part time
    // employees based on hours worked and hourly rate
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// NOTES:

// 1. We didn't add base salary in the constructor of PartTimeEmployee because
// the salary for part time employees is calculated based on hours worked and
// hourly rate, so we can set the base salary to 0 in the superclass
// constructor.

// 2. The calculateSalary method in the Employee class is defined to return 0
// because it will be overridden by the subclasses to provide specific
// implementations for calculating the salary based on the employee type. This
// allows us to use polymorphism when calling
// the calculateSalary method on Employee objects, as the correct implementation
// will be invoked based on the actual type of the object (FullTimeEmployee or
// PartTimeEmployee).
