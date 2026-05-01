package selfPtactice.School;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the task you would like to perform:");
        for (int i = 0; i < school.students.size(); i++) {
            ArrayList<Double> marks = new ArrayList<>();
            System.out.println("Enter marks for " + school.students.get(i).getName());
            for (int j = 0; j < school.getTotalSub(); j++) {
                System.out.println("Enter mark for sub " + (1 + j));
                marks.add(sc.nextDouble());
                school.students.get(i).setMarks(marks);
            }
            System.out.println("------------------------------");

        }
        String choice = null;
        do {
            System.out.println("1. Add student \n2. See the gradeSheet\n3. See Top 3 Students\n4. Remove failed students");
            int opt = sc.nextInt();
            switch (opt) {
                case 1: {

                    System.out.println("marks already given");
                    break;
                }
                case 2: {
                    school.getAllStudentandAverage();
                    System.out.println("------------------------------");
                    break;
                }
                case 3: {
                    school.getTopThreeStudents();
                    System.out.println("------------------------------");
                    break;
                }
                case 4: {
                    school.removeFailedStudents();
                    System.out.println("We have the list of passed students as ");
                    school.getAllStudentandAverage();
                    break;
                }
            }

            sc.nextLine();
            System.out.println("continue? ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println(school.getOverallAverage());
        sc.close();
    }
}
