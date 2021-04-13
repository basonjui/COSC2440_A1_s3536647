public class Student {
  // Student attributes
  private int id;
  private String name;
  private String birthdate;

  // Student methods
  public int getID() {
    return id;
  }

  public void setID(int studentID) {
    this.id = studentID;
  }

  public String getName() {
    return name;
  }

  public void setName(String studentName) {
    this.name = studentName;
  }

  public String getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(String studentBirthdate) {
    this.birthdate = studentBirthdate;
  }

  public String getInfo() {
    return this.id + " " + this.name + " " + this.birthdate;
  }

  // Student Constructor
  public Student(int studentID, String studentName, String studentBirthdate) {
    this.id = studentID;
    this.name = studentName;
    this.birthdate = studentBirthdate;
  }

  public static void main(String args[]) {
    Student stu1 = new Student(123, "Quan", "22/08/1995");

    System.out.println(stu1.getInfo());
  }

}
