package AdavacedJavaConcepts;

public class StaticBlockDemo {
    static int number;
    static{
        System.out.println("Static block is executed");
        number = 50;
    }
    public static void main(String[] args){
        System.out.println("Value of number:"+number);
    }
}
