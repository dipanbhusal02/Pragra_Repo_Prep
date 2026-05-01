package pragraClass.march31;

public class SchoolMain {
    public static void main(String[] args) {


        Student student = new Student(123, "sam");
        Course course = new Course(4444, " Java");


        Container<Student, Course> container = new Container<>(student, course);
        System.out.println(container);
    }


}
