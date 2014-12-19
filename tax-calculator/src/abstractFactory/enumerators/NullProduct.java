package abstractFactory.enumerators;

import abstractFactory.Product;
import strategy.Behaviour;
import visitor.Visitor;

/**
 * Created by Lukas Rubikas on 14.12.19.
 */
public class NullProduct extends Product {

    public NullProduct(){
        setTitle("Null object");
        setWeight(0.0);
        setPrice(0.0);
        setProductSize(ProductSize.NULL);
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "This is a Null Object";
    }

    @Override
    public void setStrategy(Behaviour strategy) {
    }

    @Override
    public void accept(Visitor visitor) {
    }
}
