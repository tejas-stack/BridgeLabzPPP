abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;

    public InPatient(int id, String name, int age, double roomCharge) {
        super(id, name, age);
        this.roomCharge = roomCharge;
    }

    @Override
    public double calculateBill() { return roomCharge + 5000; }

    @Override
    public void addRecord(String record) { System.out.println("Record added: " + record); }

    @Override
    public void viewRecords() { System.out.println("Viewing InPatient Records"); }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    public double calculateBill() { return consultationFee; }

    @Override
    public void addRecord(String record) { System.out.println("Record added: " + record); }

    @Override
    public void viewRecords() { System.out.println("Viewing OutPatient Records"); }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(1, "Alice", 30, 10000),
            new OutPatient(2, "Bob", 25, 500)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
        }
    }
}