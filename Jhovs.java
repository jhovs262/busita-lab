import java.util.Scanner;

class Vehicle {
    private final String brand;
    private final int speed;
    private final String fuelType;

    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    private final int numDoors;

    public Car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    private final boolean hasSidecar;

    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

public class Jhovs {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Car Details:");
            System.out.print("Enter car brand: ");
            String carBrand = scanner.nextLine();
            System.out.print("Enter car speed (km/h): ");
            int carSpeed = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter car fuel type: ");
            String carFuelType = scanner.nextLine();
            System.out.print("Enter number of doors: ");
            int carNumDoors = scanner.nextInt();
            scanner.nextLine();
            Car car = new Car(carBrand, carSpeed, carFuelType, carNumDoors);
            System.out.println("\nEnter Motorcycle Details:");
            System.out.print("Enter motorcycle brand: ");
            String motorcycleBrand = scanner.nextLine();
            System.out.print("Enter motorcycle speed (km/h): ");
            int motorcycleSpeed = scanner.nextInt();
            scanner.nextLine();  
            System.out.print("Enter motorcycle fuel type: ");
            String motorcycleFuelType = scanner.nextLine();
            System.out.print("Does the motorcycle have a sidecar? (true/false): ");
            boolean hasSidecar = scanner.nextBoolean();
            scanner.nextLine();  
            Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuelType, hasSidecar);
            System.out.println("\nCar Information:");
            car.displayInfo();
            System.out.println("\nMotorcycle Information:");
            motorcycle.displayInfo();
        }
    }
}
