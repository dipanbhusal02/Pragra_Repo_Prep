package selfPtactice.School;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class School {
    private int totalSub = 3;
    ArrayList<Student> students = new ArrayList<>();

    public School() {

        students.add(new Student("dipan", 333, null));
        students.add(new Student("ram", 222, null));
        students.add(new Student("hari", 232, null));
        students.add(new Student("isha", 112, null));
        students.add(new Student("dip", 332, null));
        students.add(new Student("sunn", 123, null));
    }

    Student getStudentObject(int studentID) throws NoStudentException {
        for (Student student : students) {
            if (student.getStudentId() == studentID) {
                return student;
            } else throw new NoStudentException("No Student Found");
        }
        return null;
    }
    double getOverallAverage() {
        double total = 0;
        for (Student student : students) {
            total += student.getAverage();
        }
        return total / students.size();
    }

    void getAllStudentandAverage(){
        for (Student student: students){
            System.out.println("Name : "+student.getName()+" Average: " +student.getAverage());
        }

    }

    void sortStudentsDescending() {
        Collections.sort(students, Comparator.comparingDouble(Student::getAverage).reversed());
    }

    void getTopThreeStudents(){
        sortStudentsDescending();
        for(int i=0; i<3;i++){
            System.out.println("Name :"+students.get(i).getName() +"----Score :"+students.get(i).getAverage());
        }
    }


    public int getTotalSub() {
        return totalSub;
    }

    public void setTotalSubject(int totalSub) {
        this.totalSub = totalSub;
    }

    public void removeFailedStudents() {

        Iterator<Student> studentIterator = students.iterator();

        while(studentIterator.hasNext()){

            if(studentIterator.next().getAverage()<50){
                studentIterator.remove();
            }
        }
    }
    public void addStudent(String name, int StudentID){
        students.add(new Student(name,StudentID,null));
    }
}
