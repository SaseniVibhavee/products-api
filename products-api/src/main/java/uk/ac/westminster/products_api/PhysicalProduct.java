package uk.ac.westminster.products_api;

//PhysicalProduct IS-A Product that has to be picked, packed and shipped.
public class PhysicalProduct extends Product{
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }
}
