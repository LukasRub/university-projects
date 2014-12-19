package abstractFactory;

import abstractFactory.concreteClasses.Computer;
import abstractFactory.concreteClasses.Photo;
import abstractFactory.enumerators.ElectronicsBrand;
import abstractFactory.enumerators.NullProduct;
import abstractFactory.enumerators.ProductSize;
import abstractFactory.enumerators.ProductType;

import java.util.HashMap;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public class ElectronicsFactory implements ProductFactory {
    final HashMap<ElectronicsBrand, Product> productMap = new HashMap();

    @Override
    public Product createProduct(ProductType type) {

        Product selectedProduct = null;
        switch (type) {
            case PHOTO:
                selectedProduct = getPhotoProduct(ElectronicsBrand.NIKON);
//                selectedProduct = new Photo("Nikon D7000", ElectronicsBrand.NIKON, "Nikkor 18-105mm", 16.2, 3999, 2.85, ProductSize.LARGE);
                break;
            case COMPUTER:
                selectedProduct = new Computer("Dell Inspiron N5110", ElectronicsBrand.DELL, "Nvidia GT525M", 8192, 2999, 4.25, ProductSize.LARGE);
                break;
            default:
//                throw new RuntimeException("Cannot create selected product");
                selectedProduct = new NullProduct();
        }
        return selectedProduct;
    }

    public Product getPhotoProduct(ElectronicsBrand brand) {

        Product product = productMap.get(brand);

        if(product == null) {
            product = new Photo("Nikon D7000", brand, "Nikkor 18-105mm", 16.2, 3999, 2.85, ProductSize.LARGE);
            productMap.put(brand, product);
            System.out.println("Creating a photo product of brand : " + brand.toString());
        }

        return product;

    }
}
