abstract class Vehicle {
    public abstract void startEngine();
}

class Car extends Vehicle {
    
    public void startEngine() {
        System.out.println("The car engine starts with the turn of a key.");
    }
}

class Motorcycle extends Vehicle {
    
    public void startEngine() {
        System.out.println("The motorcycle engine starts with self button");
    }
}

public class VehicleTestDrive {
    public static void vehicleTestDrive(Vehicle vehicle) {
        System.out.println("Starting the engine of the vehicle:");
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        vehicleTestDrive(car);
        System.out.println();
        vehicleTestDrive(motorcycle);
    }
}

    

