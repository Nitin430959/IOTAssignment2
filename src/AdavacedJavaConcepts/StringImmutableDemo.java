package AdavacedJavaConcepts;

public class StringImmutableDemo {
    public static void main(String[] args){
        String str = "Hello";
        System.out.println("Original String:"+str);
        str.concat("World");
        System.out.println("After concat():"+str);
        str = str.concat("World");
        System.out.println("After reassignment:"+str);
    }
}
