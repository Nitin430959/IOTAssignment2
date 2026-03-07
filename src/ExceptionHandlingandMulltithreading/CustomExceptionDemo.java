package ExceptionHandlingandMulltithreading;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        int number = -5;

        try {
            if (number < 0) {
                throw new MyException("Number cannot be negative");
            }
            System.out.println("Number: " + number);
        }
        catch (MyException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}

