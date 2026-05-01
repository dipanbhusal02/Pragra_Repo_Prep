package pragraClass.assignment.eCommerce;

public class FestivalOrder extends Order{
    @Override
    double calculateFianAmount(double amount) {
        return amount - amount*20/100;
    }
}
