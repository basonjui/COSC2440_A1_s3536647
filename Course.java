public class Course {
// Student attributes
private String id;
private String name;
private int credits;

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

final public int getCredits() {
        return credits;
}

final public void setCredits(int credits) {
        this.credits = credits;
}

final public void getCourseInfo() {
        System.out.println(this.id + ", " + this.name + ", " + this.credits);
}

// Student Constructor
public Course(String id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
}

public Course() {
}

}
