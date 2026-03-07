package ExceptionHandlingandMulltithreading;

public class ArithmeticExceptionExp {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;   // This causes ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

