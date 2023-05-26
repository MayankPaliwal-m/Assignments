package static1;

public class Car {
    private String name;
    public static int numberOfCars = 0;

    public Car(String name) {
        this.name = name;
        numberOfCars++;
    }
}
