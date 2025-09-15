abstract class Vehicle2 {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle2(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() { return rentalRate; }
    public String getType() { return type; }
    public String getVehicleNumber() { return vehicleNumber; }
    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle2 implements Insurable {
    public Car(String number, String type, double rate) { super(number, type, rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 2000; }

    @Override
    public String getInsuranceDetails() { return "Car Insurance"; }
}

class Bike extends Vehicle2 implements Insurable {
    public Bike(String number, String type, double rate) { super(number, type, rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 500; }

    @Override
    public String getInsuranceDetails() { return "Bike Insurance"; }
}

class Truck extends Vehicle2 implements Insurable {
    public Truck(String number, String type, double rate) { super(number, type, rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 5000; }

    @Override
    public String getInsuranceDetails() { return "Truck Insurance"; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle2[] vehicles = {
            new Car("C101", "Car", 2000),
            new Bike("B202", "Bike", 500),
            new Truck("T303", "Truck", 5000)
        };

        for (Vehicle2 v : vehicles) {
            System.out.println("Rental: " + v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                System.out.println("Insurance: " + ((Insurable)v).calculateInsurance());
            }
        }
    }
}