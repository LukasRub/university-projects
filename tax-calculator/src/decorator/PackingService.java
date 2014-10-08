package decorator;

import com.company.ProductSize;

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
            case BIG:
                packageCost = 7.99;
                break;
            case EXTRA_BIG:
                packageCost = 20.0;
                break;
            default:
                throw new RuntimeException("Should not be here");

        }

        return service.getCost() + packageCost;
    }
}
