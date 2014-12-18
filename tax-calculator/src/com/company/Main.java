package com.company;
import abstractFactory.ElectronicsFactory;
import abstractFactory.EntertainmentFactory;
import abstractFactory.Product;
import abstractFactory.ProductFactory;
import abstractFactory.enumerators.ProductType;
import decorator.*;
import singleton.*;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        CurrencyExchangeSingleton currencyExchange = CurrencyExchangeSingleton.getInstance();

//        currencyExchange.setCurrencyExchange(1.0, "LT");
        Service sampleServiceOne =
               new ShippingService(
                    new PackingService(
                            new ProductService("Robinson Crusoe: Adventure on the Cursed Island", 220.0),
                            ProductSize.BIG
                    ),
                    2.2
               );
        System.out.println(sampleServiceOne.toString());



//        currencyExchange.setCurrencyExchange(3.4528, "EUR");
        Service sampleServiceTwo =
                new PackingService(
                    new ProductService("Simple Lego brick", 0.99),
                    ProductSize.EXTRA_SMALL
                );
        System.out.println(sampleServiceTwo.toString());



//        currencyExchange.setCurrencyExchange(2.734, "USD");
        Service sampleServiceThree =
                new ShippingService(
                    new PackingService(
                            new ProductService("A bunch of feathers", 149.85),
                            ProductSize.EXTRA_BIG
                    ),
                    20.00
                );
        System.out.println(sampleServiceThree.toString());

        ProductFactory factoryOne = new ElectronicsFactory();
        ProductFactory factoryTwo = new EntertainmentFactory();
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(factoryOne.createProduct(ProductType.COMPUTER));
        products.add(factoryOne.createProduct(ProductType.PHOTO));
        products.add(factoryTwo.createProduct(ProductType.MOVIE));
        products.add(factoryTwo.createProduct(ProductType.GAME));
        for(Product product : products) {
            System.out.println(product.getDescription());
        }

    }
}
