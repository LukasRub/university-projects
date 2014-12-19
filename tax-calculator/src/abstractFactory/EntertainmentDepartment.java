package abstractFactory;

import strategy.Behaviour;
import strategy.NormalBehaviour;
import visitor.Visitable;
import visitor.Visitor;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public abstract class EntertainmentDepartment extends Product {
    private Behaviour strategy = new NormalBehaviour();
    private String ageRating;
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void setStrategy(Behaviour strategy) {
        this.strategy = strategy;
        System.out.println(strategy.getDescription());
    }
    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }
    public String getAgeRating() {
        return ageRating;
    }
    public double getPrice() {
        return price * strategy.getPriceCoefficient();
    }
}
