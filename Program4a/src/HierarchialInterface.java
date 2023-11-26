package Program4a.src;

// Parent class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running.");
    }
}

// Child class 1 inheriting from Vehicle
class Car extends Vehicle {
    void speed() {
        System.out.println("Car speed is 100 km/h.");
    }
}

// Child class 2 inheriting from Vehicle (Hierarchical Inheritance)
class Motorcycle extends Vehicle {
    void speed() {
        System.out.println("Motorcycle speed is 60 km/h.");
    }
}

public class HierarchialInterface {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        car.speed();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.run();
        motorcycle.speed();
    }
}
