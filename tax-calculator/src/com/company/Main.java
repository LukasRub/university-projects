package com.company;
import decorator.*;
import singleton.*;


public class Main {

    public static void main(String[] args) {

        CurrencyExchangeSingleton currencyExchange = CurrencyExchangeSingleton.getInstance();

        currencyExchange.setCurrencyExchange(1.0, "LT");
        Service sampleServiceOne =
               new ShippingService(
                    new PackingService(
                            new ProductService("Robinson Crusoe: Adventure on the Cursed Island", 220.0),
                            ProductSize.BIG
                    ),
                    2.2
               );
        System.out.println(sampleServiceOne.toString());



        currencyExchange.setCurrencyExchange(3.4528, "EUR");
        Service sampleServiceTwo =
                new PackingService(
                    new ProductService("Simple Lego brick", 0.99),
                    ProductSize.EXTRA_SMALL
                );
        System.out.println(sampleServiceTwo.toString());



        currencyExchange.setCurrencyExchange(2.734, "USD");
        Service sampleServiceThree =
                new ShippingService(
                    new PackingService(
                            new ProductService("A bunch of feathers", 149.85),
                            ProductSize.EXTRA_BIG
                    ),
                    20.00
                );
        System.out.println(sampleServiceThree.toString());

    }
}
