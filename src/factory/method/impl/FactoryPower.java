package factory.method.impl;

import factory.method.Factory;
import factory.method.Operation;

/**
 * Created by Imiracle Lee on 2017/9/7.
 */
public class FactoryPower implements Factory {
    @Override
    public Operation createFactory() {
        return new OperationPower();
    }
}
