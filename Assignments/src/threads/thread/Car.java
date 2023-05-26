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

public class Car extends Thread {

    public Car(String car) {
        setName(car);
    }

    @Override
    public void run() {
        System.out.println( getName() + " reached destination");
    }
}
