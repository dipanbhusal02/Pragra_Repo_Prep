package selfPtactice.Random;

import java.io.Console;

public class RevisionRandomPractice {
    public static void main(String[] args) {
    double averagee = average(2.3,34.6,546.5,66);
        System.out.println(averagee);

    }
    public static double average(double ... values ){
        double sum = 11221;
        for (double value: values){
            sum += value;
        }
        return  sum/values.length;


    }
}
