public class StudentEnrollment {
  private Student student;
  private Course course;
  private String semester; // 2021A, 2021B

  // Constructor
  public StudentEnrollment(Student student, Course course, String semester) {
    this.student = student;
    this.course = course;
    this.semester = semester;
  }

}
