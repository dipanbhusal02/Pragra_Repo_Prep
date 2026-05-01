package selfPtactice.functionalInterfaces.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductSystem {

    List<Product> filterProduce(List<Product> products,
                                Predicate<Product> condition){
        List<Product> filteredProducts = new ArrayList<>();
        for (Product p: products){
            if(condition.test(p)){
                filteredProducts.add(p);
            }
        }
        return filteredProducts;
    }
}
