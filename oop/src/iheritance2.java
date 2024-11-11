abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public abstract void drive();
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    } public int getYear() {
        return year;
    }
}
class Car1 extends Vehicle {
    private int numDoors;
    public Car1(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }
    public void drive() {
        System.out.println("Driving car...");
    }
    public int getNumDoors() {
        return numDoors;
    }
}
class Truck extends Vehicle {
    private int payloadCapacity;
    public Truck(String make, String model, int year, int payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }
    public void drive() {
        System.out.println("Driving truck...");
    }
    public int getPayloadCapacity() {
        return payloadCapacity;
    }

}

/*

1
There are multiple uses of inheritance in the code above and that has made it efficient and
short.We can see that there are two subclasses of Vehicle one of which is Car.
The car class adds the num doors as an addition to make,year and model and the drive method.

2
Polymorphism is a way that a method can be used for multiple use cases.
the drive method from the Car and Truck class give the perfect example for polymorphism.
Because there the drive method that has been inherited from the parent class has been used differently
in the two classes based on use case

3
In the above code Vehicle class acts as a base class for its child classes.
So we can define generic methods inside it without detailed functionality

 */