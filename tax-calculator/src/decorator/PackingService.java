package decorator;
import singleton.*;

import abstractFactory.enumerators.ProductSize;

/**
 * Created by Lukas Rubikas on 14.10.8.
 */
public class PackingService extends ServiceDecorator {

    ProductSize size;

    public PackingService(Service newService, ProductSize size) {
        super(newService);
        this.size = size;
    }

    public String getDescription() {
        return service.getDescription() + ", was applied packaging";
    }

    public double getCost() {

        double packageCost;

        switch (size){
            case EXTRA_SMALL:
                packageCost = 0.99;
                break;
            case SMALL:
                packageCost = 2.85;
                break;
            case MEDIUM:
                packageCost = 4.5;
                break;
            case LARGE:
                packageCost = 7.99;
                break;
            case EXTRA_LARGE:
                packageCost = 20.0;
                break;
            default:
                packageCost = 0.0;

        }

        packageCost *= CurrencyExchangeSingleton.getInstance().getCurrencyExchangeRate();
        return service.getCost() + packageCost;
    }
}
