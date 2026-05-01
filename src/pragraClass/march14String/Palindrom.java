package pragraClass.march14String;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String given = sc.nextLine();

        char[] stringArray= given.toCharArray();
        for(int i = 0; i<= given.length()/2; i++){
           char  temp = stringArray[i];
           stringArray[i]=stringArray[stringArray.length-1];
            stringArray[stringArray.length-1] = temp;
        }
        for(int i = 0; i< given.length(); i++){
            System.out.print(stringArray[i]);
        }
        if (given.equals(stringArray)){
            System.out.println("Ture");
        }
        else{
            System.out.println("False");
        }


    }
}
