import java.util.ArrayList;

public class StudentEnrollment {
private Student student;
private Course course;
private String semester;   // 2021A, 2021B

// Constructor
public StudentEnrollment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
}

public StudentEnrollment() {
}

// Methods

public String getStudentID() {
    return this.student.getID();
}


public void getEnrollmentInfo() {
    this.student.getStudentInfo();
    this.course.getCourseInfo();
}
}
