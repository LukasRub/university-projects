package abstractFactory.concreteClasses;

import abstractFactory.EntertainmentDepartment;
import abstractFactory.enumerators.GamingPlatform;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public class Game extends EntertainmentDepartment {
    private GamingPlatform platform;
    public Game(String gameTitle, GamingPlatform platform, String pegiRating, double price) {
        this.platform = platform;
        setTitle(gameTitle);
        setAgeRating(pegiRating);
        setPrice(price);
    }
    public String getDescription(){
        return "Product " + getTitle() + " is a video game for " + platform.toString();
    }
}