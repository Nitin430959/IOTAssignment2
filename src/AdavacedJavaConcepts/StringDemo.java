package AdavacedJavaConcepts;

public class StringDemo {
    public static void main(String[] args) {

        // String (Immutable)
        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s);

        // StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        // StringBuffer (Mutable and Thread Safe)
        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" World");
        System.out.println("StringBuffer: " + sf);
    }
}

