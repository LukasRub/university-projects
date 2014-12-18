package abstractFactory.concreteClasses;

import abstractFactory.ElectronicsDepartment;
import abstractFactory.enumerators.ElectronicsBrand;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public class Photo extends ElectronicsDepartment {
    private String kitLenses;
    private double megapixels;
    public Photo(String title, ElectronicsBrand brand, String kitLenses, double megapixels, double price) {
        this.kitLenses = kitLenses;
        this.megapixels = megapixels;
        setTitle(title);
        setBrand(brand);
        setPrice(price);
    }
    @Override
    public String getDescription() {
        return "Product " + getTitle() + " is a " + megapixels + " megapixels photo camera";
    }
}
