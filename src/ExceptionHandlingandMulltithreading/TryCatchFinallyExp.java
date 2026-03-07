package ExceptionHandlingandMulltithreading;

public class TryCatchFinallyExp {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;   // This will cause ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        }
        finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

