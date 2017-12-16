package com.imiracle.factory.method.impl;

import com.imiracle.factory.method.Operation;

/**
 * Created by Imiracle Lee on 2017/9/4.
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if (number2 == 0) {
            return Double.MAX_VALUE;
        }
        return number1 / number2;
    }
}
