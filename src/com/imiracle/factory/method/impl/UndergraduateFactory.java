package com.imiracle.factory.method.impl;

import com.imiracle.factory.method.LeifengFactory;
import com.imiracle.factory.method.Leifeng;

/**
 * Created by Imiracle Lee on 2017/9/7.
 */
public class UndergraduateFactory implements LeifengFactory {
    @Override
    public Leifeng createFactory() {
        return new Undergraduate();
    }
}
