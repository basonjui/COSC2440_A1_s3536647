import java.util.*;

public class Application {
public static void main(String args[]) {
        ArrayList<StudentEnrollment> studentEnrollmentList = new ArrayList<StudentEnrollment> ();

        // TODO: Interface to ask whether Users want to populate file
        // If no file specified: use students.csv
        int importChoice = 0;

        System.out.println("--- Welcome to the Student Enrollment Management System ---");

        boolean importLoop = false;
        while (!importLoop) {
            System.out.print("Would you like to import a Student Enrollment List? 0 = No, 1 = Yes: ");

            Scanner sc = new Scanner(System.in);
            importChoice = sc.nextInt();

            switch (importChoice) {
                case 0: {
                    System.out.println("Enter your file path: ");
                    importLoop = true;
                    break;
                }

                case 1: {
                    System.out.println("Loading default file: students.csv..");
                    importLoop = true;
                    break;
                }

                default: {
                    System.out.println("Invalid input!");
                }
            }
        }



        // TODO: Populate Students and Courses list from students.csv


        // Loop User Interface
        while (true) {
                System.out.println("");
                System.out.println("--- Student Enrollment Management ---");
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
                        addEnrollment(studentEnrollmentList);
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

// TODO: studentEnrollmentList methods: get student by ID
public static void addEnrollment(ArrayList<StudentEnrollment> studentEnrollmentList) {
        Student student = new Student();
        System.out.print("Enter student ID: ");
        Scanner sc = new Scanner(System.in);
        String studentID = sc.next();
        // Get student obj
        System.out.println("");

        Course course = new Course();
        System.out.print("Enter course ID: ");
        String courseID = sc.next();
        // Get course obj
        System.out.println("");

        System.out.print("Enter semester of enrollment: ");
        String semester = sc.next();

        studentEnrollmentList.add(new StudentEnrollment(student, course, semester));

        System.out.println(studentEnrollmentList.get(0));
}

public static void updateEnrollment(ArrayList<StudentEnrollment> studentEnrollmentList) {
    System.out.println("Overriding");
}

public static void deleteEnrollment(ArrayList<StudentEnrollment> studentEnrollmentList) {
    System.out.println("Overriding");
}

public static void getOneEnrollment(ArrayList<StudentEnrollment> studentEnrollmentList) {
    System.out.println("Overriding");
}

public static void getAllEnrollments(ArrayList<StudentEnrollment> studentEnrollmentList) {
    System.out.println("Overriding");
}
}
