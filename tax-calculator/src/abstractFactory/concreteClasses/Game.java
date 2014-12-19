package abstractFactory.concreteClasses;

import abstractFactory.EntertainmentDepartment;
import abstractFactory.enumerators.GamingPlatform;
import abstractFactory.enumerators.ProductSize;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public class Game extends EntertainmentDepartment {
    private GamingPlatform platform;
    public Game(String gameTitle, GamingPlatform platform, String pegiRating, double price, double weight,
                ProductSize productSize) {
        this.platform = platform;
        setTitle(gameTitle);
        setAgeRating(pegiRating);
        setPrice(price);
        setWeight(weight);
        setProductSize(productSize);
    }
    public String getDescription(){
        return "Product " + getTitle() + " is a video game for " + platform.toString();
    }
}