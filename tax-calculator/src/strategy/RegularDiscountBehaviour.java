package strategy;

/**
 * Created by Lukas Rubikas on 14.12.19.
 */
public class RegularDiscountBehaviour implements Behaviour {
    private String description = "Price coefficient is now regular discount level";
    @Override
    public double getPriceCoefficient() {
        return 0.75;
    }
    @Override
    public String getDescription() {
        return description;
    }
}