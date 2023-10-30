package program;
class Vehicle {
    private String brand;
    private String model;
    private int year;
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void drive() {
        System.out.println("Driving the " + year + " " + brand + " " + model);
    }
}
//Inheritated class
class Car extends Vehicle {
    private String color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }
    //Honk method
    public void honk() {
        System.out.println(color + " car honks: Honk!");
    }
}
public class InheritanceAssign1 {
    public static void main(String[] args) {
        //Create a Car object
        Car myCar = new Car("Toyota", "Camry", 2023, "Blue");

        //Call the "drive" and "honk" methods of the Car object
        myCar.drive();
        myCar.honk();
    }
}
