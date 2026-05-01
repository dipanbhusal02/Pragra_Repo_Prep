package selfPtactice.Random;

import pragraClass.march7Array.Array2DMethod;

import java.util.Scanner;

public class InputTwoDArray {
    public static void main(String[] args) {
        Array2DMethod arrayMethod = new Array2DMethod();
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the array: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of colums in the array: ");
        int column = sc.nextInt();
        int [][] array = new int[row][column];
        for( int i = 0 ; i<array.length; i++){
            for (int j= 0; j<array[i].length; j++){
                System.out.println("Enter the value at ["+ i+"]["+j+"]");
                array[i][j]= sc.nextInt();
                sum += array[i][j];
            }
        }
        for( int i = 0 ; i<array.length; i++){
            System.out.println();
            for (int j= 0; j<array[i].length; j++){
                System.out.print("  "+array[i][j]);
            }
        }
        System.out.println("\nThe sum is: "+ sum );
    }
}
