package abstractFactory;

import abstractFactory.concreteClasses.Computer;
import abstractFactory.concreteClasses.Photo;
import abstractFactory.enumerators.ElectronicsBrand;
import abstractFactory.enumerators.ProductType;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public class ElectronicsFactory implements ProductFactory {
    @Override
    public Product createProduct(ProductType type) {
        Product selectedProduct = null;
        switch (type) {
            case PHOTO:
                selectedProduct = new Photo("Nikon D7000", ElectronicsBrand.NIKON, "Nikkor 18-105mm", 16.2, 3999);
                break;
            case COMPUTER:
                selectedProduct = new Computer("Dell Inspiron N5110", ElectronicsBrand.DELL, "Nvidia GT525M", 8192, 2999);
                break;
            default:
                throw new RuntimeException("Cannot create selected product");
        }
        return selectedProduct;
    }
}
