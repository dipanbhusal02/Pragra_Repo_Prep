package pragraClass.march21OOPs.BankPay;

public class Credit extends Payment{

    @Override
    void pay() {
        System.out.println("Payment maid through credit card");
    }
}
