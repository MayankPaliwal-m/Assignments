package static1;

public class CarFactoryMain {
    public static void main(String[] args) {
        Car c = new Car("Car1");
        Car c1 = new Car("Car2");
        Car c2 = new Car("Car3");
        Car c3 = new Car("Car4");
        howManyCarsCreated();
    }

    private static void howManyCarsCreated() {
        System.out.println("no. of cars created till now " +Car.numberOfCars );
    }
}
