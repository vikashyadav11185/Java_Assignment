package oops;
//import oops.Student;
class GraduateStudent extends Student {
    String degree;

    public GraduateStudent(String name, int rollNumber, double marks, String degree) {
        super(name, rollNumber, marks);
        this.degree = degree;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Degree: " + degree);
    }
}
public class GraduateStudentClass {
	  public static void main(String[] args) {
	        GraduateStudent gradStudent = new GraduateStudent("Alice", 102, 90.0, "MSc");
	        gradStudent.displayInfo();
	    }
}
