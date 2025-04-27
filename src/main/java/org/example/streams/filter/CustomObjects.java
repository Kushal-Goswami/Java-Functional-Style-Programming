package org.example.streams.filter;

import java.util.ArrayList;
import java.util.List;

class Product
{
    private int id;
    private String name;
    private double price;
    private String category;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
public class CustomObjects {
    public static void main(String[] args) {

        List<Product>products=new ArrayList<>();
        products.add(new Product(101, "TV", 599.35, "Electronics"));
        products.add(new Product(102, "Mobile", 874.25, "Electronics"));
        products.add(new Product(103, "Shirt", 1598.45, "Clothing"));
        products.add(new Product(104, "Jeans", 1200.78, "Clothing"));
        products.add(new Product(105, "Cotton", 487.36, "Medical"));

        List<Product> filteredElectronicProduct=products.stream().filter(product -> product.getCategory().equals("Electronics"))
                .toList();
        filteredElectronicProduct.forEach(eProduct -> System.out.println(eProduct));

        List<Product> filteredProductByPrice=products.stream().filter(product -> product.getCategory().equals("Clothing"))
                .filter(product -> product.getPrice()<1500)
                .toList();

        filteredProductByPrice.forEach(price -> System.out.println(price));



    }
}
