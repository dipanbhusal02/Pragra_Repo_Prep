package pragraClass.march31;


class Container<T, U> {
    T student;
    U course;

    public Container(T student, U course) {
        this.student = student;
        this.course = course;
    }

    @Override
    public String toString() {
        return "\nContainer{" +
                "student=" + student +
                ", course=" + course +
                '}';
    }
}
