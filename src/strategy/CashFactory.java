package strategy;

import strategy.impl.CashNormal;
import strategy.impl.CashRebate;

/**
 * 工厂模式，对使用者呈现CashFactory类和CashSuper类
 * <p>
 * Created by Imiracle Lee on 2017/9/5.
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type) {
        CashSuper cashSuper = null;
        switch (type) {
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "rebate":
                cashSuper = new CashRebate(0.8);
                break;
        }
        return cashSuper;
    }
}
