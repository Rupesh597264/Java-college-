class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called: Brand = " + brand);
    }
}
class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand); 
        this.model = model;
        System.out.println("Car constructor called: Model = " + model);
    }
}
public class abs6 {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X7");
    }
}