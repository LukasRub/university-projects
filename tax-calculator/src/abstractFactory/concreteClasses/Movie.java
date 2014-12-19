package abstractFactory.concreteClasses;

import abstractFactory.EntertainmentDepartment;
import abstractFactory.enumerators.ProductSize;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public class Movie extends EntertainmentDepartment {
    private int duration;
    private String countryOfOrigin;
    public Movie(String movieTitle, int duration, String countryOfOrigin, String mpaaRating, double price, double weight,
                 ProductSize productSize) {
        this.duration = duration;
        this.countryOfOrigin = countryOfOrigin;
        setTitle(movieTitle);
        setAgeRating(mpaaRating);
        setPrice(price);
        setWeight(weight);
        setProductSize(productSize);
    }
    public String getDescription(){
        return "Product " + getTitle() + " is a movie which is " + duration + " minutes long";
    }
}