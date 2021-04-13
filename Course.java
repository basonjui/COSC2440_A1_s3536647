package studentmanagement;

public class Course {
  // Student attributes
  private String id;
  private String name;
  private int credits;

  // Student methods
  public String getID() {
    return id;
  }

  public void setID(String courseID) {
    this.id = courseID;
  }

  public String getName() {
    return name;
  }

  public void setName(String courseName) {
    this.name = courseName;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int courseCredits) {
    this.credits = courseCredits;
  }

  public String getInfo() {
    return this.id + " " + this.name + " " + this.credits;
  }

  // Student Constructor
  public Course(String courseID, String courseName, int courseCredits) {
    this.id = courseID;
    this.name = courseName;
    this.credits = courseCredits;
  }

  public static void main(String args[]) {
    Course math01 = new Course("C001", "Mathematics", 24);

    System.out.println(math01.getInfo());
  }

}
