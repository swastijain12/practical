class Student {
    int studentId;
    String name;
    String branch;

    // Parameterized constructor
    Student(int id, String n, String b) {
        studentId = id;
        name = n;
        branch = b;
    }
}

public class constructorpractical1 {
    public static void main(String args[]) {
        // Creating 3 student objects
        Student s1 = new Student(101, "Amit", "CSE");
        Student s2 = new Student(102, "Raj", "ECE");
        Student s3 = new Student(103, "Otto", "CS");

        // Printing details directly
        System.out.println("ID: " + s1.studentId + ", Name: " + s1.name + ", Branch: " + s1.branch);
        System.out.println("ID: " + s2.studentId + ", Name: " + s2.name + ", Branch: " + s2.branch);
        System.out.println("ID: " + s3.studentId + ", Name: " + s3.name + ", Branch: " + s3.branch);
    }
}
