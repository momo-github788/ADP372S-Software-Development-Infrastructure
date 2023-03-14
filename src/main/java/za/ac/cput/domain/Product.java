package za.ac.cput.domain;

import java.util.Objects;

public class Product {
    private static String Id;
    private static String Description;
    private double Price;
    private int Quantity;

    public Product(String id, String description, double price, int quality) {
        this.Id = id;
        this.Description = description;
        this.Price = price;
        this.Quantity = quality;
    }

    public static String getId() {
        return Id;
    }


    public static String getDescription() { return Description; }

    public double getPrice() {
        return Price;
    }

    public int getQuality() {
        return Quantity;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setQuality(int quality) {
        Quantity = quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.Price, Price) == 0 && Quantity == product.Quantity && Objects.equals(Id, product.Id) && Objects.equals(Description, product.Description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Description, Price, Quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id='" + Id + '\'' +
                ", Description='" + Description + '\'' +
                ", Price=" + Price +
                ", Quality=" + Quantity +
                '}';
    }
}
