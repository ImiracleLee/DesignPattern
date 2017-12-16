package com.imiracle.factory.abstracts.impl;

import com.imiracle.factory.abstracts.IDepartment;
import com.imiracle.factory.abstracts.IFactory;
import com.imiracle.factory.abstracts.IUser;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class SQLServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SQLServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SQLServerDepartment();
    }
}
