package observer;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class StockObserver {
    protected String name;
    protected Subject subject;

    public StockObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void closeStockMarket() {
        System.out.println(subject.getAction() + name + ", close stock, working!");
    }
}
