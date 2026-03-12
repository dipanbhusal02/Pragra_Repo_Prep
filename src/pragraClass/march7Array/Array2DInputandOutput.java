package classPractice.march7Array;

import java.util.Scanner;

public class Array2DInputandOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column you want: ");
        int column = sc.nextInt();
        int[][] array = new int[row][column];

        for (int i = 0; i<array.length; i++){
            for( int j = 0; j<array[i].length; j++){
                System.out.println("Please enter the value at index "+ i+ " "+ j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n You created the following array: ");
        for (int i = 0; i<array.length; i++){
            System.out.println();
            for( int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j]+ "  ");
            }
        }

    }
}
