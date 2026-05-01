package pragraClass.assignment.eCommerce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order discount = new Order();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the total amount in your cart");
        double amount = sc.nextDouble();
        discount.setTotalAmount(amount);

        System.out.println("What type of discount do you want ot apply?\nPlease choose form one of the following;");
        System.out.println("1. Regular Price\n2. Prime Discount\n3. Festival Discount");
        int option = sc.nextInt();
        switch (option){
            case 1: {
                System.out.println("No Discount applied\nTotal amount: "+ discount.calculateFianAmount(amount)+"$");
                break;
            }
            case 2: {
                discount = new PrimeOrder();
                System.out.println("Prime Member Discount Applied 10%");
                System.out.println("Total amount: "+ discount.calculateFianAmount(amount)+"$");
                break;
            }
            case 3: {
                discount = new FestivalOrder();
                System.out.println("Festival Discount Applied 20%");
                System.out.println("Total amount: "+ discount.calculateFianAmount(amount)+"$");
                break;

            }
            default:
                System.out.println("Wrong value give: ");
        }
    }
}
