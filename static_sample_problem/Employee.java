// Sample Program 3: Employee Management System
// Design an Employee class with the following features:
// Static:
// ○       A static variable companyName shared by all employees.
// ○       A static method displayTotalEmployees() to show the total number of employees.
// This:
// ○       Use this to initialize name, id, and designation in the constructor.
// Final:
// ○       Use a final variable id for the employee ID, which cannot be modified after assignment.
// Instanceof
// ○       Check if a given object is an instance of the Employee class before printing the employee details.

package static_sample_problem;

public class Employee {
    static String companyName = "Tech Solutions";
    static int totalEmployees = 0;
    public final String id;
    String name;
    String designation;
    public Employee(String id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }
    public void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }

}
class Main2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("E001", "Alice", "Developer");
        Employee emp2 = new Employee("E002", "Bob", "Designer");
        if(emp1 instanceof Employee) {
            emp1.displayDetails();
        }
        if(emp2 instanceof Employee) {
            emp2.displayDetails();
        }
        System.out.println("Total Employees: " + Employee.totalEmployees);
    }
}
