import java.util.ArrayList;

public class StudentEnrollment implements StudentEnrollmentManager{
  private Student student;
  private Course course;
  private String semester; // 2021A, 2021B

  // Constructor
  public StudentEnrollment(Student student, Course course, String semester) {
    this.student = student;
    this.course = course;
    this.semester = semester;
  }

  public StudentEnrollment() {}

  // methods
  public final void getEnrollmentInfo() {
    System.out.println(this.student.getName() + ", " + this.course.getName() + ", " + semester);
  }

  // Enrollment CRUD
  public final void addEnrollment() {
    // User input variables
    String semesterInput;

    System.out.println("Add something");
    StudentEnrollment anEnrollment = new StudentEnrollment();
  }

  public final void updateEnrollment() {
    System.out.println("Update something");
  }

  public final void deleteEnrollment() {
    System.out.println("Delete something");
  }

  public final void getOneEnrollment() {
    System.out.println("GetOne something");
  }

  public final void getAllEnrollments() {
    System.out.println("GetAll something");
  }

}
