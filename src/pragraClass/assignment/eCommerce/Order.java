package pragraClass.assignment.eCommerce;

public class Order {
    double totalAmount;

    double calculateFianAmount(double amount){
        this.totalAmount = amount;
        return totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
