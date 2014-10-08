package com.company;
import decorator.*;


public class Main {

    public static void main(String[] args) {

        Service simpleService = new ShippingService(
                new PackingService(
                        new ProductService("Robinson Crusoe: Adventure on the Cursed Island",
                                220.0),
                        ProductSize.BIG),
                2.2);

        System.out.printf("---"+"\n%s\nGRAND TOTAL: %.2f\n--\n", simpleService.getDescription(), simpleService.getCost());

    }
}
