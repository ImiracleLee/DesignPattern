package proxy;

/**
 * Created by Imiracle Lee on 2017/9/6.
 */
public class TestProxy {
    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl();
        girl.setName("Name");

        Proxy proxy = new Proxy(girl);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
