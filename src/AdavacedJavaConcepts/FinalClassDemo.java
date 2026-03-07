package AdavacedJavaConcepts;

final class Animal{
    void display(){
        System.out.println("This is a final class..");
    }
}
public class FinalClassDemo {
    public static void main(String[] args){
        Animal a = new Animal();
        a.display();
    }
}
