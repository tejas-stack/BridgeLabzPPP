abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() { return getBaseSalary(); }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }

    @Override
    public String getDepartmentDetails() { return department; }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() { return hoursWorked * hourlyRate; }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }

    @Override
    public String getDepartmentDetails() { return department; }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Alice", 50000);
        Employee e2 = new PartTimeEmployee(2, "Bob", 0, 40, 500);

        e1.displayDetails();
        System.out.println("Salary: " + e1.calculateSalary());
        e2.displayDetails();
        System.out.println("Salary: " + e2.calculateSalary());
    }
}