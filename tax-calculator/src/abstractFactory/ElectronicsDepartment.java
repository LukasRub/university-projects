package abstractFactory;

import abstractFactory.enumerators.ElectronicsBrand;
import strategy.Behaviour;
import strategy.NormalBehaviour;
import visitor.Visitable;
import visitor.Visitor;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public abstract class ElectronicsDepartment extends Product {
    private Behaviour strategy = new NormalBehaviour();
    private ElectronicsBrand brand;
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void setStrategy(Behaviour strategy) {
        this.strategy = strategy;
        System.out.println(strategy.getDescription());
    }
    public void setBrand(ElectronicsBrand brand) {
        this.brand = brand;
    }
    public ElectronicsBrand getBrand() {
        return brand;
    }
    public double getPrice() {
        return price * strategy.getPriceCoefficient();
    }
}