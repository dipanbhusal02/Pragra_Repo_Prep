package pragraClass.April18.exercise2;


import java.util.*;
import java.util.function.*;

public class Exercise2Main {

    public static void main(String[] args) {

        ProductStore store = new ProductStore();

        List<Product> products = List.of(
                new Product("Laptop",              "ELECTRONICS", 950.00, 3),
                new Product("Noise Headphones",    "ELECTRONICS", 120.00, 0),
                new Product("Mechanical Keyboard", "ELECTRONICS",  45.99, 20),
                new Product("Java Book",           "BOOKS",        35.00, 0),
                new Product("Desk Lamp",           "FURNITURE",    22.50, 8)
        );

        // ─── TASK 1: UnaryOperator — apply 10% discount ──────────────────
        System.out.println("--- Task 1: Apply 10% Discount to Laptop ---");
        Product laptop = products.get(0);
        double discountedPrice= laptop.getPrice()*0.90;
        Product discounted = store.applyDiscount(laptop, product -> new Product("Laptop","Electronics", discountedPrice,1));
        /* YOUR UNARYOPERATOR LAMBDA HERE */

        System.out.println("After discount: " + discounted);

        // ─── TASK 2: BiPredicate — price <= budget AND stock > 0 ─────────
        System.out.println("\n--- Task 2: Is Headphones affordable for budget 100? ---");
        Product headphones = products.get(1);
        boolean affordable = store.isAffordable(headphones, 100.0,(p,c)-> p.getPrice()>c && p.getStock()>0);
                /* YOUR BIPREDICATE LAMBDA HERE */

        System.out.println(affordable);

        // ─── TASK 3: BiFunction — (Product, String) → label String ───────
        System.out.println("\n--- Task 3: Generate Label for Keyboard ---");
        Product keyboard = products.get(2);
        String label = store.generateLabel(keyboard, "USD",(p, c)->
            ("["+p.getCategory()+"] "+p.getName()+"- $"+p.getPrice()+" "+c)) ;
        System.out.println(label);


        // ─── TASK 4: Supplier — create a default product ─────────────────
        System.out.println("\n--- Task 4: Default Product ---");
        Product product = new Product("Place Holder", "None", 0.0,0);
        Product placeholder = store.getDefault(()-> product);
                /* YOUR SUPPLIER LAMBDA HERE */

        System.out.println(placeholder);

        // ─── TASK 5: Consumer — log only in-stock products ───────────────
        System.out.println("\n--- Task 5: In-Stock Products ---");
        store.logProducts(products, p -> {
                    if (p.getStock() > 0)
                        System.out.println("In stock: " + p.getName() + " (" + p.getStock() + ")");

                });


        // ─── TASK 6 (BONUS): Assign Predicate to variable first ──────────
        System.out.println("\n--- Task 6 (BONUS): First Electronics product ---");
         Predicate<Product> isElectronics = e-> e.getCategory().equalsIgnoreCase("Electronics");
        store.findFirst(products, isElectronics).ifPresent(product1 -> System.out.println(product1));


        // ─── TASK 7 (BONUS): Compose two Functions ───────────────────────
        System.out.println("\n--- Task 7 (BONUS): Discount then Label ---");
         Function<Product, Product> discount10pct = product1 -> new Product(product1.getName(),product1.getCategory(),product1.getPrice()*0.90,product1.getStock());
         Function<Product, String> toLabel = product1  -> "[" + product1.getCategory() + "] " + product1.getName() + " — $" + product1.getPrice() + " USD";
         Function<Product, String> combined = discount10pct.andThen(toLabel);
         System.out.println(combined.apply(laptop));
    }
}
