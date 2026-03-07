package ExceptionHandlingandMulltithreading;

class SharedCounter {
    int count = 0;

    synchronized void increment() {
        count++;
        System.out.println("Counter: " + count);
    }
}

class ThreadDemo extends Thread {
    SharedCounter sc;

    ThreadDemo(SharedCounter sc) {
        this.sc = sc;
    }

    public void run() {
        sc.increment();
    }
}
public class SyncExample {
    public static void main(String[] args) {
        SharedCounter sc = new SharedCounter();

        ThreadDemo t1 = new ThreadDemo(sc);
        ThreadDemo t2 = new ThreadDemo(sc);

        t1.start();
        t2.start();
    }
}

