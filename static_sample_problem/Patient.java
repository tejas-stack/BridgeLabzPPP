// Sample Program 7: Hospital Management System
// Create a Patient class with the following features:
// Static:
// ○       A static variable hospitalName shared among all patients.
// ○       A static method getTotalPatients() to count the total patients admitted.
// This:
// ○       Use this to initialize name, age, and ailment in the constructor.
// Final:
// ○       Use a final variable patientID to uniquely identify each patient.
// Instanceof:
// ○       Check if an object is an instance of the Patient class before displaying its details.

package static_sample_problem;

public class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    public final String patientID;
    String name;
    int age;
    String ailment;
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    public void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
    public static int getTotalPatients() {
        return totalPatients;
    }

}
class Main6 {
    public static void main(String[] args) {
        Patient patient1 = new Patient("P001", "abcd", 30, "Flu");
        Patient patient2 = new Patient("P002", "xyz", 25, "Cold");
        if(patient1 instanceof Patient) {
            patient1.displayDetails();
        }
        if(patient2 instanceof Patient) {
            patient2.displayDetails();
        }
        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}
