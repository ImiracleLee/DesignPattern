package factory.method.impl;


import factory.method.Operation;

/**
 * Created by Imiracle Lee on 2017/9/4.
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return number1 + number2;
    }
}
