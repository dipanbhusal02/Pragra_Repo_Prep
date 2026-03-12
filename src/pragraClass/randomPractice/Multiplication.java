package pragraClass.randomPractice;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Which number multiplication table you want to print? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+" x "+i+" = "+n*i);
            i++;
        }

    }
}
