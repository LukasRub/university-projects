package abstractFactory;

import abstractFactory.concreteClasses.Game;
import abstractFactory.concreteClasses.Movie;
import abstractFactory.enumerators.GamingPlatform;
import abstractFactory.enumerators.NullProduct;
import abstractFactory.enumerators.ProductSize;
import abstractFactory.enumerators.ProductType;

/**
 * Created by Lukas Rubikas on 14.12.18.
 */
public class EntertainmentFactory implements ProductFactory {

    @Override
    public Product createProduct(ProductType type){
        Product selectedProduct = null;
        switch(type) {
            case MOVIE:
                selectedProduct = new Movie("sampleMovieTitle", 108, "USA", "PG-13", 9.99, 0.3, ProductSize.EXTRA_SMALL);
                break;
            case GAME:
                selectedProduct = new Game("sampleGameTitle", GamingPlatform.PC, "PEGI 12+", 14.99, 0.3,
                        ProductSize.EXTRA_SMALL);
                break;
            default:
//                throw new RuntimeException("Cannot create selected product");
                selectedProduct = new NullProduct();
        }
        return selectedProduct;
    }
}
