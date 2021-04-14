import java.util.*;

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

  // methods
  public final void getEnrollmentInfo() {
    System.out.println(this.student.getName() + ", " + this.course.getName() + ", " + semester);
  }

  public final void add() {
    System.out.println("Add something");
  }

  public final void update() {
    System.out.println("Update something");
  }

  public final void delete() {
    System.out.println("Delete something");
  }

  public final void getOne() {
    System.out.println("GetOne something");
  }

  public final void getAll() {
    System.out.println("GetAll something");
  }

}
