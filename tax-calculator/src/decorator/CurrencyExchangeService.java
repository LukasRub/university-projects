package decorator;
import singleton.*;

/**
 * Created by lukas on 14.10.9.
 */
public class CurrencyExchangeService extends ServiceDecorator {

    double currencyExchangeRate;

    public CurrencyExchangeService(Service newService) {
        super(newService);
        this.currencyExchangeRate = CurrencyExchangeSingleton.getInstance().getCurrencyExchangeRate();
    }

    @Override
    public String getDescription() {
        return service.getDescription() + ", was applied currency exchange";
    }

    @Override
    public double getCost() {
        return service.getCost() * currencyExchangeRate;
    }
}
