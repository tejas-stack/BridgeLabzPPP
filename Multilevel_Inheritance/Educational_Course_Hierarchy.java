package Multilevel_Inheritance;
class Course {
    String courseName;
    int duration; // in hours

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayInfo() {
        System.out.println(courseName + " on " + platform + " Duration: " + duration + "hrs");
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
    }
}

public class Educational_Course_Hierarchy {

    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Mastery", 40, "Udemy", true, 199.99, 20);
        poc.displayInfo();
    }
}
