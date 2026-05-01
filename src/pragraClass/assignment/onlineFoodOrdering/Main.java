package pragraClass.assignment.onlineFoodOrdering;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order;
        PaymentMode pay;
        Scanner sc = new Scanner(System.in);
        System.out.println("provide order id");
        int orderId = sc.nextInt();
        System.out.println("provide amount");
        double amount = sc.nextDouble();

        System.out.println("Choose one: \n1. Regular order\n2. Premium order");
        int choice = sc.nextInt();
        if (choice == 1) {
            order = new RegularOrder(orderId, amount);

            System.out.println("Final amount is: " + order.calculateFinalAmount());
        } else if (choice == 2) {
            order = new PremiumOrder(orderId, amount);
            System.out.println("Final amount is: " + order.calculateFinalAmount());
        } else {
            System.out.println("Wrong input");
        }
        System.out.println(" 1 to pay with card\n 2 to pay with UPI");
        int c= sc.nextInt();
        if(c==1){
            pay= new CardPayment();
            pay.pay();
        }
        else if (c==2){
            pay = new UpiPyament();
            pay.pay();
        }
        else System.out.println("Invalid Input");

    }
}
