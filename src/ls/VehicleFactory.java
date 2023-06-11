package ls;

import java.util.Scanner;
// Define the Vehicle interface
interface Vehicle {
    void move();
}
// Implement the Helicopter class
class Helicopter implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}
// Implement the Car class
class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Car drives on the road.");
    }
}
// Implement the Train class
class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Train runs on the track.");
    }
}
// Main class
class VehicleFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Vehicle Factory!");
        while (true) {
            System.out.println("What kind of vehicle would you like to order?");
            System.out.println("1. Helicopter");
            System.out.println("2. Car");
            System.out.println("3. Train");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            if (choice == 4) {
                System.out.println("Thank you for using the Vehicle Factory. Goodbye!");
                break;
            }
            Vehicle vehicle = createVehicle(choice);
            if (vehicle != null) {
                vehicle.move();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
    // Create the appropriate vehicle based on user choice
    private static Vehicle createVehicle(int choice) {
        switch (choice) {
            case 1:
                return new Helicopter();
            case 2:
                return new Car();
            case 3:
                return new Train();
            default:
                return null;
        }
    }
}

