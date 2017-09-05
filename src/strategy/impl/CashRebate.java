package strategy.impl;

import strategy.CashSuper;

/**
 * Created by Imiracle Lee on 2017/9/5.
 */
public class CashRebate extends CashSuper {
    double rebate = 1.0;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * rebate;
    }
}
