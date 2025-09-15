// Sample Program 5: University Student Management
// Create a Student class to manage student data with the following features:
// Static:
// ○       A static variable universityName shared across all students.
// ○       A static method displayTotalStudents() to show the number of students enrolled.
// This:
// ○       Use this in the constructor to initialize name, rollNumber, and grade.
// Final:
// ○       Use a final variable rollNumber for each student that cannot be changed.
// Instanceof:
// ○       Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.

package static_sample_problem;

public class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;
    public final String rollNumber;
    String name;
    String grade;
    public Student(String rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;}
    public void displayDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
    public static int displayTotalStudents() {
        return totalStudents;
    }

}
class Main4 {
    public static void main(String[] args) {
        Student student1 = new Student("S001", "abcd", "A");
        Student student2 = new Student("S002", "xyz", "B");
        if(student1 instanceof Student) {
            student1.displayDetails();
        }
        if(student2 instanceof Student) {
            System.out.println(Student.displayTotalStudents());
        }
    }
}
