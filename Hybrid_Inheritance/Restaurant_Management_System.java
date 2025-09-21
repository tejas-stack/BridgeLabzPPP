package Hybrid_Inheritance;

// Java solution for Restaurant Management System

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking food.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving customers.");
    }
}
public class Restaurant_Management_System {
    public static void main(String[] args) {
        Worker[] staff = {
            new Chef("John", 101),
            new Waiter("Emily", 102)
        };

        for (Worker w : staff) {
            w.performDuties();
        }
    }
}
