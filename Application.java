import java.util.*;

public final class Application {
  public static void main(String args[]) {

    System.out.println("Welcome to Student Enrollment App! \n");

    Student student1 = new Student("s001", "Quan", "22/08/1995");
    student1.getStudentInfo();

    Course course1 = new Course("MATH101", "Mathematics 101", 24);
    course1.getCourseInfo();

    StudentEnrollment enroll1 = new StudentEnrollment(student1, course1, "2021A");
    enroll1.getEnrollmentInfo();
  }
}
