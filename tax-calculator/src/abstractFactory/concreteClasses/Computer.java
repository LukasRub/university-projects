package abstractFactory.concreteClasses;

import abstractFactory.ElectronicsDepartment;
import abstractFactory.enumerators.ElectronicsBrand;
import abstractFactory.enumerators.ProductSize;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public class Computer extends ElectronicsDepartment {
    private String graphicsCard;
    private int ram;
    public Computer(String title, ElectronicsBrand brand, String graphicsCard, int ram, double price, double weight,
                    ProductSize productSize) {
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        setTitle(title);
        setBrand(brand);
        setPrice(price);
        setWeight(weight);
        setProductSize(productSize);
    }
    @Override
    public String getDescription() {
        return "Product " + getTitle() + " is a computer of brand " + getBrand().toString() +
                " which has included " + graphicsCard + " graphics card";
    }
}
