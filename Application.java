import java.util.*;

public final class Application {
  public static void main(String args[]) {
    ArrayList<StudentEnrollment> studentEnrollmentList = new ArrayList<>();
    while (true) {
			System.out.println("----Welcome to the Student Enrollment Management System----");
			System.out.println("1. Add student information");
			System.out.println("2. Modify student information");
			System.out.println("3. Delete student information");
			System.out.println("4. View all student information");
			System.out.println("5. Exit");
			System.out.println("Please enter options:");

			Scanner sc = new Scanner(System.in);
			int chose = sc.nextInt();
			switch (chose) {
			case 1: {
				//Add(arr);
        System.out.println("Add Enrollment");
				break;
			}
			case 2: {
				//Alter(arr);
        System.out.println("Update Enrollment");
				break;
			}
			case 3: {
				//Remove(arr);
        System.out.println("Delete Enrollment");
				break;
			}
			case 4: {
				//Look(arr);
        System.out.println("Get One Enrollment");
				break;
			}
      case 5: {
        System.out.println("Get All Enrollments");
        break;
      }
			case 6: {
				System.out.println("Thank you for using our service, goodbye!");
				System.exit(0);
			}
			default:
				System.out.println("Invalid input! Please try again with options 1 to 6.");
			}
		}

    // Student student1 = new Student("s001", "Quan", "22/08/1995");
    // student1.getStudentInfo();
    //
    // Course course1 = new Course("MATH101", "Mathematics 101", 24);
    // course1.getCourseInfo();
    //
    // StudentEnrollment enroll1 = new StudentEnrollment(student1, course1, "2021A");
    // enroll1.getEnrollmentInfo();
  }
}
