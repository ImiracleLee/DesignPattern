package com.imiracle.factory.method.impl;

import com.imiracle.factory.method.Factory;
import com.imiracle.factory.method.Operation;

/**
 * Created by Imiracle Lee on 2017/9/6.
 */
public class FactoryMuti implements Factory {
    @Override
    public Operation createFactory() {
        return new OperationMuti();
    }
}
