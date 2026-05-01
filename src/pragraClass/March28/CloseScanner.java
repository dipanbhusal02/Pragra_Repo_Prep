package pragraClass.March28;

import java.util.Locale;
import java.util.Scanner;

public class CloseScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("whats you name?");
        String name = sc.nextLine();
        String lowercase;
        try {
            lowercase = name.toLowerCase();
        }  finally {
            sc.close();
        }

        System.out.println(lowercase);
    }
}
