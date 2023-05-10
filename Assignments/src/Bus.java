import inheritance.Vehicle;
public class Bus extends Vehicle{
    int numOfPassenger ;

    public Bus(String name , String regNum , int numOfPassenger){
        super(name, regNum);
        this.numOfPassenger = numOfPassenger ;
    }

    public void vehicleDetails(){
        super.vehicleDetails();
        System.out.println(" and "+numOfPassenger+" passenger can travel in it");
    }
}
