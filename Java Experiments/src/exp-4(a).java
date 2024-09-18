// Define the Vehicle interface
interface Vehicle {
    void startEngine();
    void accelerate();
}

// Implement the Car class
class Car implements Vehicle {
    public void startEngine() {
        System.out.println("Car engine started.");
    }
    
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

// Implement the Motorcycle class
class Motorcycle implements Vehicle {
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }
    
    public void accelerate() {
        System.out.println("Motorcycle is accelerating.");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        
        myCar.startEngine();
        myCar.accelerate();
        
        myMotorcycle.startEngine();
        myMotorcycle.accelerate();
    }
}
