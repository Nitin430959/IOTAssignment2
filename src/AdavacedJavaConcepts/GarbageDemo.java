package AdavacedJavaConcepts;

public class GarbageDemo {
    protected void finalize() {
        System.out.println("Garbage collected object");
    }

    public static void main(String[] args) {

        GarbageDemo obj1 = new GarbageDemo();
        GarbageDemo obj2 = new GarbageDemo();

        // Make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Request JVM to run Garbage Collector
        System.gc();

        System.out.println("End of main method");
    }
}

