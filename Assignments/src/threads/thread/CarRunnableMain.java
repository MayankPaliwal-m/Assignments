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

public class CarRunnableMain {
    public static void main(String[] args) {

        CarRunnable car1 = new CarRunnable("AudiR8_v10");
        CarRunnable car2 = new CarRunnable("Bhrum-Bhrum");
        CarRunnable car3 = new CarRunnable("Bumble-B");
        CarRunnable car4 = new CarRunnable("Lightning_McQueen");

        Thread t1 = new Thread(car1);
        Thread t2 = new Thread(car2);
        Thread t3 = new Thread(car3);
        Thread t4 = new Thread(car4);

        t1.start();
        t2.start();
        t4.start();
        t3.start();
    }
}
