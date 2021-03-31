
import yahoofinance.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MarketExchange implements Runnable{

    // maximum number of threads to update stock prices
    final int maxThreads = 10;

    MxStock[] mxStocks;

    MarketExchange() {

        //initialize stocks
        mxStocks = MxStockFactory.GetStocks();


        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newWorkStealingPool(maxThreads);

    }




    @Override
    public void run() {



    }
}