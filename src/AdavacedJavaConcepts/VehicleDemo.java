package AdavacedJavaConcepts;

interface Vehicle {
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car is starting..");
    }
}
public class VehicleDemo {
    public static void main(String[] args){
        Car c = new Car();
    }
}
