package factory.method.impl;

import factory.method.Factory;
import factory.method.Operation;

/**
 * Created by Imiracle Lee on 2017/9/6.
 */
public class FactoryMuti implements Factory {
    @Override
    public Operation createFactory() {
        return new OperationMuti();
    }
}
