package com.imiracle.strategy.impl;

import com.imiracle.strategy.CashSuper;

/**
 * Created by Imiracle Lee on 2017/9/5.
 */
public class CashReturn extends CashSuper {
    private double conditionMoney;
    private double returnMoney;

    public CashReturn(double conditionMoney, double returnMoney) {
        this.conditionMoney = conditionMoney;
        this.returnMoney = returnMoney;
    }

    @Override
    public double acceptCash(double money) {
        if (money < conditionMoney) {
            return money;
        }
        return money - Math.floor(money / conditionMoney) * returnMoney;
    }
}
