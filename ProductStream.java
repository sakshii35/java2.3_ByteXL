import java.util.*;
import java.util.stream.*;

class Product {
    int id;
    String name;
    double price;
    String category;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + price + " - " + category;
    }
}

public class ProductStream {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 80000, "Electronics"),
            new Product(2, "Mobile", 40000, "Electronics"),
            new Product(3, "Book", 500, "Stationery"),
            new Product(4, "Pen", 50, "Stationery"),
            new Product(5, "Headphones", 2000, "Electronics")
        );

        System.out.println("Products costing more than 1000:");
        products.stream()
                .filter(p -> p.price > 1000)
                .forEach(System.out::println);

        System.out.println("\nSorted by Price (ascending):");
        products.stream()
                .sorted(Comparator.comparingDouble(p -> p.price))
                .forEach(System.out::println);

        System.out.println("\nAverage Price of all Products:");
        double avg = products.stream()
                             .mapToDouble(p -> p.price)
                             .average()
                             .orElse(0.0);
        System.out.println(avg);

        System.out.println("\nList of Product Names (using map):");
        products.stream()
                .map(p -> p.name)
                .forEach(System.out::println);
    }
}
