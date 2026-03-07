package AdavacedJavaConcepts;

public class StringBuilderConcat {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append("World");
        sb.append("!");
        System.out.println("Concatenated String:"+sb.toString());
    }
}
