package factory.method.impl;

import factory.method.Operation;

/**
 * Created by Imiracle Lee on 2017/9/7.
 */
public class OperationPower extends Operation {
    @Override
    public double getResult() {
        return Math.pow(number1, number2);
    }
}
