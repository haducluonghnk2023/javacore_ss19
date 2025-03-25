package Ex.Ex09;

import java.util.List;

public interface ProductProcessor {
    double calculateTotalValue(List<Product> products);
    static void  printProductList(List<Product> products){
        System.out.println(products.toString());
    };
    default boolean hasExpensiveProduct(List<Product> products){
        for (Product product : products){
            if (product.getPrice() > 100){
                return true;
            }
        }
        return false;
    };
}
