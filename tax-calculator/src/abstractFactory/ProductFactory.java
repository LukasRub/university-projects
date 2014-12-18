package abstractFactory;

import abstractFactory.enumerators.ProductType;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public interface ProductFactory {
    Product createProduct(ProductType type);
}
