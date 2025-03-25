package Ex.Ex09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product>  products = new ArrayList<>();
        products.add(new Product("Laptop", 120.0));
        products.add(new Product("Phone", 80.0));
        products.add(new Product("Tablet", 150.0));
        products.add(new Product("Headphones", 50.0));

        ProductProcessorImpl p = new ProductProcessorImpl();
        if(p.hasExpensiveProduct(products)){
            System.out.println("Các sản phẩm có giá lớn hơn 100:");
            for (Product product : products){
                if (product.getPrice() > 100){
                    System.out.println(product.getName());
                }
            }
        }
        double totalValue = p.calculateTotalValue(products);
        System.out.println("Tổng giá trị của tất cả sản phẩm: " + totalValue);

        System.out.println("Danh sách sản phẩm:");
        ProductProcessor.printProductList(products);
    }
}
