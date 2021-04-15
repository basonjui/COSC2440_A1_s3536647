final public class Student {
private String id;
private String name;
private String birthdate;

// Student methods
final public String getID() {
        return id;
}

final public void setID(String id) {
        this.id = id;
}

final public String getName() {
        return name;
}

final public void setName(String name) {
        this.name = name;
}

final public String getBirthdate() {
        return birthdate;
}

final public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
}

final public void getStudentInfo() {
        System.out.println(this.id + ", " + this.name + ", " + this.birthdate);
}

// Student Constructor
public Student(String id, String name, String birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
}

public Student() {
}

}
