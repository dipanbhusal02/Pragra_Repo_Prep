package selfPtactice.Random;

import pragraClass.march7Array.Array2DMethod;

import java.util.Scanner;

public class SaddlePointfinder {
    public static void main(String[] args) {
        Array2DMethod array = new Array2DMethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();

        array.initializeArray(row, col);
        array.getArrayFromUser();
        array.displayArray();
        array.greatest();
        array.sumOfRow();

    }
}
