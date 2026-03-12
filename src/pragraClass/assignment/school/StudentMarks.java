package pragraClass.assignment.school;

import java.util.Scanner;

public class StudentMarks {
    Scanner sc = new Scanner(System.in);
    String[] students;
    double[][] marks;
    double average = 0;




    public StudentMarks(String[] students, double[][] marks) {
        this.students = students;
        this.marks = marks;
    }


    public void displayAll() {
        System.out.println("Marks are as; ");
        for (int i = 0; i < students.length; i++) {

            System.out.println("\nStudent: " + students[i]);

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Subject " + (j + 1) + ": " + marks[i][j]);


            }

        }
    }

    public void getAverage() {
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            double totalpersub= 0;

            for (int j = 0; j < marks[i].length; j++) {
                totalpersub += marks[i][j];

            }
            System.out.println("Average marks for "+ students[i]+ " is " + (totalpersub/marks[i].length));

        }
    }
}
