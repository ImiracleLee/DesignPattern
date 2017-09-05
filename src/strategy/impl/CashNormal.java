package strategy.impl;

import strategy.CashSuper;

/**
 * Created by Imiracle Lee on 2017/9/5.
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
