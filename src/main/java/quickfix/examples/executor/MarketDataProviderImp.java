package quickfix.examples.executor;

public class MarketDataProviderImp implements MarketDataProvider{
    @Override
    public double getAsk(String symbol) {
        if (symbol=="STAR") return 112.40 ;
        else return 1;
    }

    @Override
    public double getBid(String symbol) {
        if (symbol=="STAR") return 113.00 ;
       else return 1;
    }
}
