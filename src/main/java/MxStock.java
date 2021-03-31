import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;

public class MxStock {

    public final Stock stock;

    public MxStock(String inSymbol) throws IOException {

        this.stock = YahooFinance.get(inSymbol);

    }

    public void print(){
        System.out.println(stock.getSymbol());
    }
}
