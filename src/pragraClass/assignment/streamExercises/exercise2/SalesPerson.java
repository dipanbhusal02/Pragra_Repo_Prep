package pragraClass.assignment.streamExercises.exercise2;


import java.util.*;

public class SalesPerson {

    private String     name;
    private String     region;
    private List<Sale> sales;

    public SalesPerson(String name, String region, List<Sale> sales) {
        this.name   = name;
        this.region = region;
        this.sales  = sales;
    }

    public String     getName()   { return name; }
    public String     getRegion() { return region; }
    public List<Sale> getSales()  { return sales; }

    // Convenience: total revenue for this salesperson
    public double getTotalRevenue() {
        return sales.stream()
                .mapToDouble(Sale::getAmount)
                .sum();
    }
}
