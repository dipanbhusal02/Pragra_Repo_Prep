package selfPtactice.functionalInterfaces.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class StreamApiMainPractice {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.50),
                new Product("Phone", 800.00),
                new Product("Headphones", 150.75),
                new Product("Keyboard", 90.25),
                new Product("Mouse", 40.00)
        );

List<Product> filteredProducted= products.stream().
        map(p->new Product(p.getName(),p.getPrice()*0.90)).
        filter(p-> p.getPrice()>100).
        toList();

        System.out.println(filteredProducted);
    }
}
