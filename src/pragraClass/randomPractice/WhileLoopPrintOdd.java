package pragraClass.randomPractice;
import java.util.Scanner;
public class WhileLoopPrintOdd {
    public static void main(String[] args) {
        System.out.println("Sum of even numbers form what number? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        while (n>=0 ) {

                while (n%2==0) {
                    even = even +n;
                    break;
                }
                while (n%2!=0) {
                    odd = odd +n;
                    break;
                }
                n--;
            System.out.println(n);
            }
        System.out.println("The sum of even numbers is: "+ even);
        System.out.println("The sum of odd numbers is: "+ odd);

        }
    }

