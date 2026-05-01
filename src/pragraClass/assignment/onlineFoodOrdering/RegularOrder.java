package pragraClass.assignment.onlineFoodOrdering;

public class RegularOrder extends Order{

     public RegularOrder(int orderId, double amount) {
         super(orderId, amount);
     }

    @Override
    double calculateFinalAmount() {
         double amount = getAmount();
        return amount;
    }

}
