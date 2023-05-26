package runnable;

public class MyRunnable implements Runnable{

    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Printing no. " + i + " from thread " + name);
        }
    }
}
