package strategy;

/**
 * Created by Lukas Rubikas on 14.12.19.
 */
public class NormalBehaviour implements Behaviour {
    private String description = "Price coefficient is now at normal level";
    @Override
    public double getPriceCoefficient() {
        return 1;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
