package chainOfResponsibility;

import abstractFactory.enumerators.ProductSize;

/**
 * Created by Lukas Rubikas on 14.12.19.
 */
public interface ShippingHandler {
    public void setNextHandler(ShippingHandler nextHandler);
    public void handlePostage(ProductSize productSize, double weight);
}
