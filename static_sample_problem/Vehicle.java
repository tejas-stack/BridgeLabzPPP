// Sample Program 6: Vehicle Registration System
// Create a Vehicle class with the following features:
// Static:
// ○       A static variable registrationFee common for all vehicles.
// ○       A static method updateRegistrationFee() to modify the fee.
// This:
// ○       Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
// Final:
// ○       Use a final variable registrationNumber to uniquely identify each vehicle.
// Instanceof:
// ○       Check if an object belongs to the Vehicle class before displaying its registration
// ○       details.

package static_sample_problem;

public class Vehicle {
    static double registrationFee = 150.0;
    public final String registrationNumber;
    String ownerName;
    String vehicleType;
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

class Main5 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("123", "abcd", "Car");
        if(vehicle1 instanceof Vehicle) {
            vehicle1.displayDetails();
        }
        Vehicle.updateRegistrationFee(200.0);
        Vehicle vehicle2 = new Vehicle("456", "xyz", "Motorcycle");
        if(vehicle2 instanceof Vehicle) {
            vehicle2.displayDetails();
        }
    }
}
