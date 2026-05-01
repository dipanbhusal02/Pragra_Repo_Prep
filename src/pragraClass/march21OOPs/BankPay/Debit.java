package pragraClass.march21OOPs.BankPay;

public class Debit extends Payment{

    @Override
    void pay() {
        System.out.println("Payment made through debit card!");
    }
}
