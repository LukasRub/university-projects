package strategy;

/**
 * Created by Lukas Rubikas on 14.12.19.
 */
public class BlackFridayBehaviour implements Behaviour{
    private String description = "Price coefficient is now at Black friday level";
    @Override
    public double getPriceCoefficient() {
        return 0.5;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
