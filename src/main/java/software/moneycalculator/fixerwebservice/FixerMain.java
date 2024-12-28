package software.moneycalculator.fixerwebservice;

import software.moneycalculator.Currency;
import software.moneycalculator.ExchangeRateLoader;

public class FixerMain {
    public static void main(String[] args) {
       Currency from = new Currency("USD", "United States dollar");
       Currency to = new Currency("EUR", "Euro");
       ExchangeRateLoader exchangeRateLoader = new FixerExchangeRateLoader();
       System.out.println(exchangeRateLoader.load(from, to).toString());
    }
}
