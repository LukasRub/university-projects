package chainOfResponsibility;

import abstractFactory.enumerators.ProductSize;

/**
 * Created by Lukas Rubikas on 14.12.19.
 */
public class LPCourierPost implements ShippingHandler {
    private ShippingHandler nextHandler;

    @Override
    public void setNextHandler(ShippingHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handlePostage(ProductSize productSize, double weight) {
        switch (productSize) {
            case EXTRA_SMALL:
            case SMALL:
            case MEDIUM:
            case LARGE:
            case EXTRA_LARGE:
                System.out.println("Shipping will be handled by Lithuanian post courier post service");
                break;
        }
    }
}
