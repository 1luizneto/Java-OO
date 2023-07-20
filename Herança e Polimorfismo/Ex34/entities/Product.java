package entities;

public class Product {
    private String name;
    protected Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        setName(this.name = name);
        setPrice(this.price = price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", getPrice());
    }
}
