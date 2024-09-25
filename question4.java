class Vehicle {
    String registrationNumber;
    String brand;

    public Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber + ", Brand: " + brand);
    }

    // Method to calculate parking fee (overridden in subclasses)
    public double calculateParkingFee() {
        return 0;
    }
}

class Car extends Vehicle {
    int numDoors;

    public Car(String registrationNumber, String brand, int numDoors) {
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }

    @Override
    public double calculateParkingFee() {
        return 50; // Example: Flat rate for cars
    }
}

class Motorcycle extends Vehicle {
    String engineType;

    public Motorcycle(String registrationNumber, String brand, String engineType) {
        super(registrationNumber, brand);
        this.engineType = engineType;
    }

    @Override
    public double calculateParkingFee() {
        return 20; // Example: Flat rate for motorcycles
    }
}

public class question4 {
    public static void main(String[] args) {
        Car car = new Car("KA01AB1234", "Toyota", 4);
        Motorcycle motorcycle = new Motorcycle("KA02XY5678", "Honda", "Petrol");

        car.displayDetails();
        System.out.println("Parking Fee: $" + car.calculateParkingFee());

        motorcycle.displayDetails();
        System.out.println("Parking Fee: $" + motorcycle.calculateParkingFee());
    }
}
