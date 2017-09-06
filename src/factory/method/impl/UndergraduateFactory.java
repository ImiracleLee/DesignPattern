package factory.method.impl;

import factory.method.Leifeng;
import factory.method.LeifengFactory;

/**
 * Created by Imiracle Lee on 2017/9/7.
 */
public class UndergraduateFactory implements LeifengFactory {
    @Override
    public Leifeng createFactory() {
        return new Undergraduate();
    }
}
