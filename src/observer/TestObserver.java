package observer;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new Boss();
        StockObserver observer1 = new StockObserver("observer1", subject);

        subject.addListener(observer1, "closeStockMarket");

        subject.setAction("Boss come back! ");

        subject.notice();
    }
}
