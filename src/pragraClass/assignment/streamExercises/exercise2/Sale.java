package pragraClass.assignment.streamExercises.exercise2;

public class Sale {

    private String product;
    private double amount;
    private String region;    // "NORTH", "SOUTH", "EAST", "WEST"
    private int    quarter;   // 1, 2, 3, 4

    public Sale(String product, double amount, String region, int quarter) {
        this.product = product;
        this.amount  = amount;
        this.region  = region;
        this.quarter = quarter;
    }

    public String getProduct()  { return product; }
    public double getAmount()   { return amount; }
    public String getRegion()   { return region; }
    public int    getQuarter()  { return quarter; }

    @Override
    public String toString() {
        return product + " | $" + amount + " | " + region + " | Q" + quarter;
    }
}