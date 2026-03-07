package ExceptionHandlingandMulltithreading;

public class LifeCycle extends Thread{
    public void run() {
        System.out.println("Thread is running");

        try {
            Thread.sleep(1000);   // waiting state
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Thread finished");
    }

    public static void main(String[] args) {

        LifeCycle t1 = new LifeCycle();   // NEW state
        System.out.println("State after creation: " + t1.getState());

        t1.start();   // RUNNABLE state
        System.out.println("State after start: " + t1.getState());
    }
}

