package com.imiracle.factory.method.impl;

import com.imiracle.factory.method.Operation;

/**
 * Created by Imiracle Lee on 2017/9/4.
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return number1 - number2;
    }
}
