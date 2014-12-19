package chainOfResponsibility;

import abstractFactory.enumerators.ProductSize;

/**
 * Created by Lukas Rubikas on 14.12.19.
 */
public class LPLargeLetterPost implements ShippingHandler {
    private ShippingHandler nextHandler;
    private final double maximumWeight = 2000.0;

    @Override
    public void setNextHandler(ShippingHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handlePostage(ProductSize productSize, double weight) {
        switch (productSize){
            case EXTRA_SMALL:
            case SMALL:
            case MEDIUM:
            case LARGE:
                if (weight <= maximumWeight) {
                    System.out.println("Shipping will be handled by Lithuanian Post large letter post service");
                    break;
                }
            default:
                nextHandler.handlePostage(productSize, weight);
        }
    }
}
