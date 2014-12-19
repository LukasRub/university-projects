package decorator;
import singleton.*;

/**
 * Created by Lukas Rubikas on 14.10.8.
 */
public abstract class ProductService implements Service {

    private String productName;
    private double productPrice;

    public ProductService(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double getCost();

}
