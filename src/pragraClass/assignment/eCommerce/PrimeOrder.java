package pragraClass.assignment.eCommerce;

public class PrimeOrder extends Order{
    @Override
    double calculateFianAmount(double amount) {
        return amount - amount*10/100;
    }
}
