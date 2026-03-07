package AdavacedJavaConcepts;

abstract class Shape{
    abstract void display();
}
class Circle extends Shape{
    void display(){
        System.out.println("This is a Circle shape");
    }
}
public class main {
    public static void main(String[] args){
        Circle c = new Circle();
        c.display();
    }
}
