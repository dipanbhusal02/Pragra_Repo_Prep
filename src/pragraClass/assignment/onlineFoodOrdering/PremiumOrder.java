package pragraClass.assignment.onlineFoodOrdering;

public class PremiumOrder extends Order{
    public PremiumOrder(int orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    double calculateFinalAmount() {
        System.out.println("You are subjected for free delivery");
        return getAmount() - ((double) 10 /100*getAmount());
    }
}
