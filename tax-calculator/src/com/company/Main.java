package com.company;
import abstractFactory.ElectronicsFactory;
import abstractFactory.EntertainmentFactory;
import abstractFactory.Product;
import abstractFactory.ProductFactory;
import abstractFactory.enumerators.ProductSize;
import abstractFactory.enumerators.ProductType;
import adapter.ProductAdapter;
import chainOfResponsibility.LPCourierPost;
import chainOfResponsibility.LPLargeLetterPost;
import chainOfResponsibility.LPSmallLetterPost;
import chainOfResponsibility.ShippingHandler;
import decorator.*;
import strategy.Behaviour;
import strategy.BlackFridayBehaviour;
import strategy.RegularDiscountBehaviour;
import visitor.ImportDutiesVisitor;
import visitor.VATVisitor;
import visitor.Visitor;

import java.util.ArrayList;


public class Main {

    public static ShippingHandler getChainOfHandlers() {
        ShippingHandler smallLetterPost = new LPSmallLetterPost();
        ShippingHandler largeLetterPost = new LPLargeLetterPost();
        ShippingHandler courierPost = new LPCourierPost();
        smallLetterPost.setNextHandler(largeLetterPost);
        largeLetterPost.setNextHandler(courierPost);
        return smallLetterPost;
    }

    public static void main(String[] args) {

        ProductFactory factoryOne = new ElectronicsFactory();
        ProductFactory factoryTwo = new EntertainmentFactory();

        ArrayList<Product> products = new ArrayList<Product>();

        products.add(factoryOne.createProduct(ProductType.COMPUTER));
        products.add(factoryOne.createProduct(ProductType.PHOTO));
        products.add(factoryOne.createProduct(ProductType.PHOTO));
        products.add(factoryOne.createProduct(ProductType.PHOTO));
        products.add(factoryOne.createProduct(ProductType.PHOTO));
        products.add(factoryTwo.createProduct(ProductType.MOVIE));
        products.add(factoryTwo.createProduct(ProductType.GAME));
        products.add(factoryTwo.createProduct(ProductType.MUSIC));

        System.out.println('\n');

        Behaviour regularDiscount = new RegularDiscountBehaviour();
        Behaviour blackFriday = new BlackFridayBehaviour();

        Visitor vatTax = new VATVisitor();
        Visitor importDutiesTax = new ImportDutiesVisitor();

        ShippingHandler chainOfHandlers = getChainOfHandlers();

        for(Product product : products) {
            System.out.println(product.getDescription());
            product.setStrategy(regularDiscount);
            System.out.println("Price before taxes: " + String.format("%.2f", product.getPrice()));
            product.accept(vatTax);
            product.accept(importDutiesTax);
            System.out.println("Price after taxes: " + String.format("%.2f", product.getPrice()));
            Service service = new ShippingService(new PackingService(new ProductAdapter(product),
                    product.getProductSize()), product.getWeight());
            System.out.println(service.toString());
            chainOfHandlers.handlePostage(product.getProductSize(), product.getWeight());
            System.out.println("\n\n");
        }

    }
}
