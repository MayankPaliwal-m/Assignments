import inheritance.Vehicle;
public class Truck extends Vehicle {
    String loadCapacity ;

    public Truck(String name , String regNum , String loadCap){
        super(name , regNum);
        loadCapacity = loadCap;
    }

    public void vehicleDetails(){
        System.out.println("  ");
        super.vehicleDetails();
        System.out.println(" and it's load carrying capacity is "+loadCapacity);
    }

}


