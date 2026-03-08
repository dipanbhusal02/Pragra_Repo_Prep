package classPractice.randomPractice;

import java.util.Scanner;

public class WhileLoopPrintN {
    public static void main(String[] args) {
        System.out.println("Print the nubmer you want to loop");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N>=0) {
            System.out.println(N);
            N--;
        }
    }
    }
