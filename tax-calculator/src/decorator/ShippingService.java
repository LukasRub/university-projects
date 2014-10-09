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

        if (this.productWeight <= 0) {
            throw new RuntimeException("Product weight below zero");
        }
        else if (this.productWeight > 20) {
            throw new RuntimeException("We don't ship products heavier than 20 kgs");
        }
        else {

            double shippingCost = 3.95;

            if (productWeight > 0.5 && productWeight <= 1.0) {
                shippingCost = 4.95;
            }
            else if (productWeight <= 2.5) {
                shippingCost = 7.89;
            }
            else if (productWeight <= 10) {
                shippingCost = 15.0;
            }
            else {
                shippingCost = 25.0;
            }

            return service.getCost() + shippingCost;
        }
    }


}
