package singleton;

/**
 * Created by lukas on 14.10.9.
 */
public class CurrencyExchangeSingleton {

    private static CurrencyExchangeSingleton ourInstance = null;
    private double currencyExchangeRate = 1.0;
    private String currencyLabel = "LT";

    public static CurrencyExchangeSingleton getInstance() {

        if (ourInstance == null)

            synchronized (CurrencyExchangeSingleton.class) {

                ourInstance = new CurrencyExchangeSingleton();

            }

        return ourInstance;

    }

    private CurrencyExchangeSingleton() {
    }

    public double getCurrencyExchangeRate() {
        return ourInstance.currencyExchangeRate;
    }

    public void setCurrencyExchange(double currencyExchangeRate, String currencyLabel) {
        ourInstance.currencyExchangeRate = currencyExchangeRate;
        ourInstance.currencyLabel = currencyLabel;
    }

}
