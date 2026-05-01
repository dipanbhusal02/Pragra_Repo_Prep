package selfPtactice.School;

import java.util.ArrayList;

public class Student {
    private String name;
    private int StudentId;
    private ArrayList<Double> marks;

    public Student(String name, int studentId, ArrayList<Double> marks) {
        this.name = name;
        StudentId = studentId;
        this.marks = marks;
    }

    double getAverage() throws NullPointerException {
        double total = 0;
        if (marks != null) {
            for (Double mark : marks) {
                if (mark != null) {
                    total += mark;
                }
            }
        } else {
            throw new NullPointerException("Marks Not initialized");
        }
        return total / marks.size();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return StudentId;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Double> marks) {
        this.marks = marks;
    }
}
