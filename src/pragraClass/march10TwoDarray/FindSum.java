package pragraClass.march10TwoDarray;

public class FindSum {
    public static void main(String[] args) {
        int [][] array = {{2,5,6},{8,2,7}};
        int sum = 0;
        for (int i=0; i<array.length; i++){
            for(int j = 0 ; j<array[i].length; j++){
                sum += array[i][j];
            }
        }
        System.out.println("Sum is: "+ sum);
    }
}
