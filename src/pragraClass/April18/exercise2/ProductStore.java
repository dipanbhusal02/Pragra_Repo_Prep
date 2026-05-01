package pragraClass.April18.exercise2;


import java.util.*;
import java.util.function.*;

public class ProductStore {

    // Task 1 — UnaryOperator: same type in and out (Product → Product)
    public Product applyDiscount(Product product,
                                 UnaryOperator<Product> discountFn) {
        return discountFn.apply(product);
    }

    // Task 2 — BiPredicate: (Product, Double) → boolean
    public boolean isAffordable(Product product, double budget,
                                BiPredicate<Product, Double> check) {
        return check.test(product, budget);
    }

    // Task 3 — BiFunction: (Product, String) → String
    public String generateLabel(Product product, String currency,
                                BiFunction<Product, String, String> labelFn) {
        return labelFn.apply(product, currency);
    }

    // Task 4 — Supplier: () → Product
    public Product getDefault(Supplier<Product> factory) {
        return factory.get();
    }

    // Task 5 — Consumer: Product → void (called for ALL products)
    public void logProducts(List<Product> products,
                            Consumer<Product> logger) {
        for (Product p : products) {
            logger.accept(p);
        }
    }

    // Task 6 — Predicate: find first matching product
    public Optional<Product> findFirst(List<Product> products,
                                       Predicate<Product> condition) {
        for (Product p : products) {
            if (condition.test(p)) return Optional.of(p);
        }
        return Optional.empty();
    }
}