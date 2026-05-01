package pragraClass.assignment.notificationSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notification notification;
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome to notification center!");
            System.out.println("Which way would you like to send message? \nPlease select one:");
            System.out.println("1. SMS\n2. PushNotification\n3. Email");
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    notification = new SMSNotification();
                    notification.sent();
                    break;
                }
                case 2: {
                    notification = new PushNotification();
                    notification.sent();
                    break;
                }
                case 3: {
                    notification = new EmailNotification();
                    notification.sent();
                    break;
                }
                default:
                    System.out.println("You chose the wrong option");
            }
            System.out.println("\nDo you want to continue? If yes enter 0");
             choice = sc.nextInt();
        }

        while (choice ==0);
    }
}
