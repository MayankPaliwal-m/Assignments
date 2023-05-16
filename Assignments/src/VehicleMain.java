import inheritance.Vehicle;

public class VehicleMain {
    public static void main(String[] args){

        Vehicle vehicle1 = new Vehicle("Tata Altroz" , "MP37MA1887");
        Vehicle vehicle2 = new Vehicle("Hyundai i20" , "MP37MA1976");
        Vehicle vehicle3 = new Vehicle("Audi R8 V10" , "MP09MP1137");

//      vehicle1.vehicleDetails();
//      vehicle2.vehicleDetails();

        vehicle3.vehicleDetails();

        Truck tataTruck = new Truck("Dumpher :) " , "RJ11CH01597" ,  "1.5 ton");

        Bus bus1 = new Bus("Volvo" , "MP09AP0521" , 60);

        Bus bus2 = new Bus("Tata" , "MP09AP1889" , 70);

        tataTruck.vehicleDetails();
        bus1.vehicleDetails();
        bus2.vehicleDetails();

        System.out.println(vehicle3);
        System.out.println(tataTruck);
        System.out.println(bus1);


    }
}
