package pragraClass.assignment.school;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the nubmer of students you want in your class: ");
        int student = sc.nextInt();
        String [] students = new String[student];
        System.out.println("Enter the number of subjects student have: ");
        int subs = sc.nextInt();
        sc.nextLine();
        double [][] marks = new double[student][subs];
        for (int i  = 0; i<students.length; i++){

            System.out.println("Enter the name of the student: "+ (i+1));
            students[i]= sc.nextLine();
            System.out.println("Now Enter the scores in different subjects for "+ students[i]+ ": ");
            for( int j= 0; j< marks[i].length; j++){
                System.out.print("Subject "+ (j+1)+": ");
                marks[i][j]= sc.nextInt();


            }
            sc.nextLine();
        }

        StudentMarks studetnMark = new StudentMarks(students, marks);
        studetnMark.displayAll();
        System.out.println();
        studetnMark.getAverage();


    }
}
