package com.imiracle.factory.method.impl;

import com.imiracle.factory.method.Leifeng;
import com.imiracle.factory.method.LeifengFactory;

/**
 * Created by Imiracle Lee on 2017/9/7.
 */
public class VolunteerFactory implements LeifengFactory {
    @Override
    public Leifeng createFactory() {
        return new Volunteer();
    }
}
