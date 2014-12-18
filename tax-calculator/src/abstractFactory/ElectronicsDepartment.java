package abstractFactory;

import abstractFactory.enumerators.ElectronicsBrand;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public abstract class ElectronicsDepartment implements Product {
    private String title;
    private ElectronicsBrand brand;
    private double price;
    public void setTitle(String title) {
        this.title = title;
    }
    public void setBrand(ElectronicsBrand brand) {
        this.brand = brand;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public ElectronicsBrand getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
}