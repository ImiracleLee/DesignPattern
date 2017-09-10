package facade;

/**
 * 外观类，知道哪些子系统类负责处理请求，将请求代理给适当的子系统对象
 * Created by Imiracle Lee on 2017/9/10.
 */
public class Fund {
    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
    }

    public void sellFund() {
        stock1.sell();
        stock2.sell();
        stock3.sell();
    }

    public void buyFund() {
        stock1.buy();
        stock2.buy();
        stock3.buy();
    }
}
