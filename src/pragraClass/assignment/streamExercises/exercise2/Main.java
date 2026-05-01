package pragraClass.assignment.streamExercises.exercise2;

import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        List<SalesPerson> salesPeople = List.of(
                new SalesPerson("Alice Chen", "NORTH", List.of(
                        new Sale("Enterprise License", 8000,  "NORTH", 1),
                        new Sale("Cloud Subscription",  2500,  "NORTH", 2),
                        new Sale("Support Package",     4000,  "NORTH", 3)
                )),
                new SalesPerson("Bob Kumar", "SOUTH", List.of(
                        new Sale("Cloud Subscription",  3200,  "SOUTH", 1),
                        new Sale("Hardware Bundle",     6150,  "SOUTH", 4)
                )),
                new SalesPerson("Diana Prince", "EAST", List.of(
                        new Sale("Enterprise License", 12000, "EAST",  2),
                        new Sale("Support Package",     3000,  "EAST",  3),
                        new Sale("Hardware Bundle",     3200,  "EAST",  4)
                )),
                new SalesPerson("Eve Torres", "WEST", List.of(
                        new Sale("Cloud Subscription",  5300,  "WEST",  1)
                ))
        );

      /*  // ─── TASK 1: flatMap all sales → total revenue ────────────────────
        System.out.println("--- Task 1: Total Revenue ---");
        double total = salesPeople.stream()
                *//* flatMap → mapToDouble → sum *//*;
        System.out.println("Total revenue: $" + total);

        // ─── TASK 2: Highest single sale (with salesperson name) ──────────
        System.out.println("\n--- Task 2: Highest Single Sale ---");
        *//* Hint: you need to know WHICH salesperson made the best sale.
           Strategy A: flatMap Sale objects only → find max by amount — but you lose the name.
           Strategy B: flatMap to a simple helper string or print inside the outer stream.
           Simplest: stream salesPeople, use flatMap but carry context. See hint. *//*

        // ─── TASK 3: Map of name → total revenue ─────────────────────────
        System.out.println("\n--- Task 3: Revenue per Salesperson ---");
        Map<String, Double> revenueMap = salesPeople.stream()
                *//* toMap: key = name, value = getTotalRevenue() *//*;
        revenueMap.forEach((name, rev) ->
                System.out.printf("%-14s → $%s%n", name, rev));

        // ─── TASK 4: Top performer ────────────────────────────────────────
        System.out.println("\n--- Task 4: Top Performer ---");
        salesPeople.stream()
        *//* max by getTotalRevenue → ifPresent → print *//*;

        // ─── TASK 5: Group all sales by product ──────────────────────────
        System.out.println("\n--- Task 5: Sales by Product ---");
        Map<String, List<Sale>> byProduct = salesPeople.stream()
                *//* flatMap → groupingBy product *//*;
        byProduct.forEach((prod, list) ->
                System.out.printf("%-22s: %d sale(s)%n", prod, list.size()));

        // ─── TASK 6: summaryStatistics on all sale amounts ────────────────
        System.out.println("\n--- Task 6: Revenue Statistics ---");
        DoubleSummaryStatistics stats = salesPeople.stream()
                *//* flatMap → mapToDouble → summaryStatistics *//*;
        System.out.printf("Count   : %d sales%n",  stats.getCount());
        System.out.printf("Total   : $%.1f%n",    stats.getSum());
        System.out.printf("Min     : $%.1f%n",    stats.getMin());
        System.out.printf("Max     : $%.1f%n",    stats.getMax());
        System.out.printf("Average : $%.2f%n",   stats.getAverage());

        // ─── TASK 7: Salespeople with at least one sale > 5000 ───────────
        System.out.println("\n--- Task 7: Salespeople with a sale > $5000 ---");
        List<String> highSellers = salesPeople.stream()
                *//* filter where anyMatch on sales > 5000 → map to name *//*;
        System.out.println(highSellers);

        // ─── TASK 8 BONUS: Formatted report, sorted by revenue desc ──────
        System.out.println("\n--- Task 8 (BONUS): Sales Report ---");
        String report = salesPeople.stream()
                *//* sort by getTotalRevenue descending → map to formatted string → joining("\n") *//*;
        System.out.println(report);*/
    }
}