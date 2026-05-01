package pragraClass.march21OOPs.BankPay;

public class PaymentMain {
    public static void main(String[] args) {
        UPI upi = new UPI();
        Debit debit = new Debit();
        upi.pay();
        debit.pay();
    }

}
