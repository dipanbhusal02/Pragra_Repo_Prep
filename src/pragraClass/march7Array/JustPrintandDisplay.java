package pragraClass.march7Array;

import java.util.Scanner;

public class JustPrintandDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array2DMethod array = new Array2DMethod();
        System.out.println("Enter the number of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int column = sc.nextInt();
        array.InitializeArray(row, column);
        array.GetArrayFromUser();
        array.displayArray();
        System.out.println("\nThe 90 degree rotation of the whole array is as: ");
        array.transpose();
        array.reverseRow();
        array.displayArray();



    }
}
