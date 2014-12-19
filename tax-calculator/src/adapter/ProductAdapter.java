package adapter;

import abstractFactory.Product;
import decorator.ProductService;
import singleton.*;

/**
 * Created by Lukas Rubikas on 14.12.19.
 */
public class ProductAdapter extends ProductService {
    private Product product;

    public ProductAdapter(Product product) {
        super(product.getTitle(), product.getPrice());
        this.product = product;
    }

    @Override
    public String getDescription() {
        return "Product " + product.getTitle() + " was sold";
    }

    @Override
    public double getCost() {
//        System.out.println(CurrencyExchangeSingleton.getInstance().getCurrencyExchangeRate());
        return product.getPrice() * CurrencyExchangeSingleton.getInstance().getCurrencyExchangeRate();
    }
}
