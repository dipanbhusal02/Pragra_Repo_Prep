package pragraClass.march31;

public class Course {
    int courseID;
    String name;

    public Course(int courseID, String name) {
        this.courseID = courseID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", name='" + name + '\'' +
                '}';
    }
}
