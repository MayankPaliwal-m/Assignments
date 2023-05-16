// Create Vehicle class with name, and vehicle registration number
//Create method in Vehicle class to print name and registration number
//
//Create child class, Truck, Bus
//Truck will have additional field called load capacity
//Bus will have additional field called number of passenger.
//
//Create method in child classes to print all, name, registration number and child specific details .

package inheritance;
public class Vehicle {

    String vehicleName ;
    String vehicleRegistrationNum ;

    public Vehicle(String name , String regNum){
        vehicleName = name;
        vehicleRegistrationNum = regNum;
    }

    public void vehicleDetails(){
        System.out.printf("Vehicle's name is "+vehicleName+" , Vehicle's registration number is "+vehicleRegistrationNum);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                ", vehicleRegistrationNum='" + vehicleRegistrationNum + '\'' +
                '}';
    }
}