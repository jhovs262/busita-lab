public class SchoolTest {
    public static void main(String[] args) {
       
       
        Student student = new Student("Busita", 1, "1st year college");
        Teacher teacher = new Teacher("Sir Joel", 2, "Hardwire");
        Staff staff = new Staff("Sir Archie", 3, "OOP");
 
       
        System.out.println("Student Info:");
        student.displayInfo();
        System.out.println("\nTeacher Info:");
        teacher.displayInfo();
        System.out.println("\nStaff Info:");
        staff.displayInfo();
    }
}
 