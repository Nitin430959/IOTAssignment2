package AdavacedJavaConcepts;

public class StaticExp {
    static int count = 0;   // static variable

    StaticExp() {
        count++;   // increment when object is created
    }

    static void displayCount() {   // static method
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {
        StaticExp obj1 = new StaticExp();
        StaticExp obj2 = new StaticExp();
        StaticExp obj3 = new StaticExp();

        StaticExp.displayCount();   // calling static method
    }
}

