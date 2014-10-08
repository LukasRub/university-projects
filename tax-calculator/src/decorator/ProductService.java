package decorator;

/**
 * Created by Lukas Rubikas on 14.10.8.
 */
public class ProductService implements Service {

    private String productName;
    private double productPrice;

    public ProductService(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String getDescription() {
        return "Product " + this.productName + " was sold";
    }

    @Override
    public double getCost() {
        return this.productPrice;
    }
}
