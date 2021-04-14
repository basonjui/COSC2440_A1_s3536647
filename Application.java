import java.util.*;

public final class Application {
  public static void main(String args[]) {
    ArrayList<StudentEnrollment> studentEnrollmentList = new ArrayList<StudentEnrollment>();

    // TODO: Interface to ask whether Users want to populate file
    // If no file specified: use students.csv


    // TODO: Populate Students and Courses list from students.csv


    // Loop User Interface
    while (true) {
      System.out.println("");
			System.out.println("--- Welcome to the Student Enrollment Management System ---");
			System.out.println("1. Add Student Enrollment");
			System.out.println("2. Update Student Enrollment");
			System.out.println("3. Delete Student Enrollment");
			System.out.println("4. Get One Student Enrollment");
			System.out.println("5. Get All Student Enrollments");
      System.out.println("6. Exit Student Enrollment Management System");
			System.out.print("Please enter your choice: ");

			Scanner sc = new Scanner(System.in);
			int userChoice = sc.nextInt();

      System.out.println("");

			switch (userChoice) {
			case 1: {
				//Add(arr);
        System.out.println("--- Add Enrollment ---");

				break;
			}
			case 2: {
				//Alter(arr);
        System.out.println("--- Update Enrollment ---");

				break;
			}
			case 3: {
				//Remove(arr);
        System.out.println("--- Delete Enrollment ---");
				break;
			}
			case 4: {
				//Look(arr);
        System.out.println("--- Get One Enrollment ---");
				break;
			}
      case 5: {
        System.out.println("--- Get All Enrollments ---");
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
  }
}
