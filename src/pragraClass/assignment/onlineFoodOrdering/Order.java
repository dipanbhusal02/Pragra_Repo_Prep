package pragraClass.assignment.onlineFoodOrdering;

public abstract class Order {
    private int orderId;
    private double amount;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }
    abstract double  calculateFinalAmount();

    void printOrderSummary(){
        System.out.println("Order Id: "+ orderId);
        System.out.println("Order amount: "+ amount);
    }

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }
}
