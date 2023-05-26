// Assignment 1
//	Create class Car which extends Thread
//	Override run method and print “Car <thread name > reached destination>”
//	Create 4 threads with name C1 to C4
//	Start 4 threads and look at the output which car reaches destination first
//
//
//Assignment 2
//	Create class CarRunnable and do same process above, with implementing Runnable interface.

package threads.thread;

public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car("AudiR8_V10");
        Car car2 = new Car("Lamborghini_Aventador");
        Car car3 = new Car("Tata_Altroz");
        Car car4 = new Car("Porsche_911");

        car4.start();
        car3.start();
        car2.start();
        car1.start();
    }
}
