package pragraClass.assignment.onlineFoodOrdering;

public class UpiPyament implements PaymentMode{
    @Override
    public void pay() {
        System.out.println("Paid using UPI");
    }
}
