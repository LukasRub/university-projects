package abstractFactory.concreteClasses;

import abstractFactory.ElectronicsDepartment;
import abstractFactory.enumerators.ElectronicsBrand;
import abstractFactory.enumerators.ProductSize;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public class Photo extends ElectronicsDepartment {
    private String kitLenses;
    private double megaPixels;
    public Photo(String title, ElectronicsBrand brand, String kitLenses, double megaPixels, double price, double weight,
                 ProductSize productSize) {
        this.kitLenses = kitLenses;
        this.megaPixels = megaPixels;
        setTitle(title);
        setBrand(brand);
        setPrice(price);
        setWeight(weight);
        setProductSize(productSize);
    }
    @Override
    public String getDescription() {
        return "Product " + getTitle() + " is a " + megaPixels + " million pixels photo camera";
    }
}
