package pragraClass.assignment.onlineFoodOrdering;

public class CardPayment implements PaymentMode{
    @Override
    public void pay() {
        System.out.println("Paid using card");
    }
}
