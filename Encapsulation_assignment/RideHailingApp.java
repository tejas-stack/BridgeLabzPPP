abstract class Vehicle1 {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle1(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public double getRatePerKm() { return ratePerKm; }
    public void getVehicleDetails() { System.out.println("Driver: " + driverName + ", Rate: " + ratePerKm); }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle1 implements GPS {
    private String location;
    public Car(int id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { this.location = newLocation; }
}

class Bike extends Vehicle1 implements GPS {
    private String location;
    public Bike(int id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { this.location = newLocation; }
}

class Auto extends Vehicle1 implements GPS {
    private String location;
    public Auto(int id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { this.location = newLocation; }
}

public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle1[] rides = {
            new Car(1, "Alice", 15),
            new Bike(2, "Bob", 10),
            new Auto(3, "Charlie", 12)
        };

        for (Vehicle1 v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare: " + v.calculateFare(10));
        }
    }
}