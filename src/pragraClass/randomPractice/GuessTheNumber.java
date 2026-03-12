package pragraClass.randomPractice;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 10);
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("Guest the number between 0 to 10");
            Scanner sc = new Scanner(System.in);

            int guess = sc.nextInt();
            if (guess == num) {
                System.out.println("Congratulations! You guessed the number correctly.");
                break;
            } else {
                System.out.println("Sorry, you guessed the number wrong. Try again.");
            }
        }
        System.out.println("You have used all your chances. The correct number was: " + num);
    }


}
