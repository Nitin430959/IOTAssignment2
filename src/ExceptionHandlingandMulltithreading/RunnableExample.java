package ExceptionHandlingandMulltithreading;

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();   // Create object

        Thread t1 = new Thread(obj);         // Create thread using object
        t1.start();                          // Start thread
    }
}


