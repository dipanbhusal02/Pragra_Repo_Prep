package selfPtactice.studentGradeCalculate;

import java.util.ArrayList;
import java.util.Iterator;

public class School {
    ArrayList<Student> students = new ArrayList<>();

    public School() {

        students.add(new Student(70, "Dipan"));
        students.add(new Student(30, "Ram"));
        students.add(new Student(80, "Sam"));
        students.add(new Student(49, "Shish"));
        students.add(new Student(99, "Isha"));
        students.add(new Student(60, "Git"));


    }

    void displayStudents() {
        for (Student student : students) {

            System.out.println(student.getName() + "---------" + student.getMark());
        }
    }

    Student getStudentWithHighMark() {
        Student studentWithHighMark = null;
        double highmark = 0;
        for (Student student : students) {
            if (student.getMark() > highmark) {
                highmark = student.getMark();
                studentWithHighMark = student;
            }
        }
        return studentWithHighMark;
    }

    double getAverage() {
        double totalmarks = 0;
        for (Student student : students) {
            totalmarks += student.getMark();
        }
        return totalmarks / students.size();
    }

    void removeFailedStudents() {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            if (studentIterator.next().getMark() < 50) {
                studentIterator.remove();
            }
        }
    }
}
