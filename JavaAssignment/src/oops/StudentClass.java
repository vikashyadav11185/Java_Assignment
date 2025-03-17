package oops;
class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}
public class StudentClass {
    public static void main(String[] args) {
        Student student1 = new Student("John", 101, 85.5);
        student1.displayInfo();
    }
}
