package selfPtactice.studentGradeCalculate;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        school.displayStudents();
        System.out.println("------------------------\n");
        System.out.println(school.getStudentWithHighMark().getMark());
        System.out.println(school.getAverage());
        school.removeFailedStudents();
        school.displayStudents();

    }
}
