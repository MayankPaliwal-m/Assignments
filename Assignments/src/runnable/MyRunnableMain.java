package runnable;

public class MyRunnableMain {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable("R1");
        MyRunnable r2 = new MyRunnable("R2");
        MyRunnable r3 = new MyRunnable("R3");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        System.out.println("starting threads");

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(9);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("t1,t2 and t3 started");
    }
}
