package abstractFactory;

import abstractFactory.enumerators.ProductSize;
import strategy.Behaviour;
import visitor.Visitable;
import visitor.Visitor;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public abstract class Product implements Visitable {
    protected String title;
    protected double weight;
    protected double price;
    protected ProductSize productSize;

    public String getTitle() {
        return title;
    }
    public double getWeight() {
        return weight;
    }
    public ProductSize getProductSize() { return productSize; }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setWeight(double weight) { this.weight = weight; }
    public void setProductSize(ProductSize productSize) {
        this.productSize = productSize;
    }

    public abstract double getPrice();
    public abstract String getDescription();
    public abstract void setStrategy(Behaviour strategy);
//    public abstract void accept(Visitor visitor);
}
