package uk.ac.westminster.products_api;

// A PhysicalProduct is a Product because it is a specific type of product with additional physical properties.
// A ShoppingCart has a relationship with Product because it contains products rather than being a product itself.

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
        super();
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}