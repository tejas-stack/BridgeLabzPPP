package Hierarchical_Inheritance;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Teacher of " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Student of grade " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Staff in department " + department);
    }
}
public class School_System_with_Different_Roles {

    public static void main(String[] args) {
        Person[] people = {
            new Teacher("Mr. Smith", 40, "Math"),
            new Student("Alice", 16, 10),
            new Staff("Bob", 35, "Administration")
        };

        for (Person p : people) {
            if (p instanceof Teacher) ((Teacher)p).displayRole();
            if (p instanceof Student) ((Student)p).displayRole();
            if (p instanceof Staff) ((Staff)p).displayRole();
        }
    }
}
