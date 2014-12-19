package decorator;

/**
 * Created by Lukas Rubikas on 14.10.8.
 */
public class ShippingService extends ServiceDecorator {

    double productWeight;

    public ShippingService(Service newService, double productWeight) {
        super(newService);
        this.productWeight = productWeight;
    }

    public String getDescription() {
        return service.getDescription() + ", was applied shipping cost";
    }

    public double getCost() {

        double shippingCost = 0.0;

        if (productWeight > 0.0) {
            shippingCost = 4.95;
        }
        else if (productWeight > 0.5) {
            shippingCost = 4.95;
        }
        else if (productWeight > 1.0) {
            shippingCost = 7.89;
        }
        else if (productWeight > 2.5) {
            shippingCost = 15.0;
        }
        else if (productWeight > 10)  {
            shippingCost = 25.0;
        }

        return service.getCost() + shippingCost;
    }


}
