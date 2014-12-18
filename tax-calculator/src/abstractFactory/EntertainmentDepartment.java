package abstractFactory;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public abstract class EntertainmentDepartment implements Product {
    private String title;
    private String ageRating;
    private double price;
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAgeRating() {
        return ageRating;
    }
    public double getPrice() {
        return price;
    }
}
