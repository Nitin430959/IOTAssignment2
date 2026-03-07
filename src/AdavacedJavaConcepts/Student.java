package AdavacedJavaConcepts;

public class Student {
    int rollNo;
    String name;
    static String college = "ABC College"; // static variable

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void changeCollege() {   // static method
        college = "XYZ College";
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.changeCollege();   // calling static method

        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(2, "Anita");

        s1.display();
        s2.display();
    }
}

