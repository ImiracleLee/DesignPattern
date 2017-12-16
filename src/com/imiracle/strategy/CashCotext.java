package com.imiracle.strategy;

import com.imiracle.strategy.impl.CashNormal;
import com.imiracle.strategy.impl.CashRebate;
import com.imiracle.strategy.impl.CashReturn;

import java.text.DecimalFormat;

/**
 * 策略模式+工厂模式，只对使用者呈现CashCotext类
 * <p>
 * Created by Imiracle Lee on 2017/9/5.
 */
public class CashCotext {
    private CashSuper cashSuper;

    public CashCotext(String type) {
        switch (type) {
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "rebate":
                cashSuper = new CashRebate(0.8);
                break;
            case "return":
                cashSuper = new CashReturn(300, 100);
                break;
        }
    }

    public double getResult(double money) {
        DecimalFormat format = new DecimalFormat("#.00");
        return Double.valueOf(format.format(cashSuper.acceptCash(money)));
    }
}
