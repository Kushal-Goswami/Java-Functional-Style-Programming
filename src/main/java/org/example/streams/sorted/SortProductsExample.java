package org.example.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Product {
    int id;
    String name;
    Double price;

    public Product(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class SortProductsExample {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product(1, "Mobile", 484.32),
                new Product(2, "TV", 654.25),
                new Product(3, "Watch", 857.45),
                new Product(4, "Ipod", 584.89)
        );

        System.out.println("Sort products by price in ASC order");
        System.out.println();

//        List<Product> resultProductByPriceASC=productList.stream()
//                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
//                .toList();

        List<Product> resultProductByPriceASC = productList.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();

        resultProductByPriceASC.forEach(product -> System.out.println(product.toString()));

        System.out.println();

        System.out.println("Sort products by price in DSC order");
        System.out.println();
        List<Product> resultProductByPriceDSC = productList.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .toList();

        resultProductByPriceDSC.forEach(product -> System.out.println(product.toString()));
        System.out.println();
        System.out.println("Sort products by name in ASC order");
        System.out.println();
        List<Product> resultProductByNameASC = productList.stream()
                .sorted(Comparator.comparing(Product::getName))
                .toList();

        resultProductByNameASC.forEach(product -> System.out.println(product.toString()));
        System.out.println();
        System.out.println("Sort products by name in DSC order");
        System.out.println();
        List<Product> resultProductByNameDSC = productList.stream()
                .sorted(Comparator.comparing(Product::getName).reversed())
                .toList();
        resultProductByNameDSC.forEach(product -> System.out.println(product.toString()));

        System.out.println();
        List<Product> productList2 = Arrays.asList(
                new Product(1, "Mobile", 484.32),
                new Product(2, "TV", 857.45),
                new Product(3, "Watch", 857.45),
                new Product(4, "Ipod", 584.89)
        );

        // Sort products by price and name in ASC order if the price are same

        List<Product> resultProductByNameAndPriceASC = productList2.stream()
                .sorted(Comparator.comparing(Product::getPrice).thenComparing(Product::getName))
                .toList();

        resultProductByNameAndPriceASC.forEach(product -> System.out.println(product));
        System.out.println();

        // Sort products by price and name in DSC order if the price are same

        List<Product> resultProductByNameAndPriceDSC = productList2.stream()
                .sorted(Comparator.comparing(Product::getPrice).thenComparing(Product::getName).reversed())
                .toList();

        resultProductByNameAndPriceDSC.forEach(product -> System.out.println(product));

    }
}
