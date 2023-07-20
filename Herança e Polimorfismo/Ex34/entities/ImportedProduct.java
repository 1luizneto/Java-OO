package entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        setCustomsFee(this.customsFee = customsFee);
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        double valor = getPrice();
        setPrice(valor + getCustomsFee());
        return valor += getCustomsFee();
    }

    @Override
    public String priceTag() {
        return super.priceTag()
                + " (Customs fee: $ "
                + String.format("%.2f", getCustomsFee())
                + ")";
    }
}
