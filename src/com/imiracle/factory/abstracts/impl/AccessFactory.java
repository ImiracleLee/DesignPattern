package com.imiracle.factory.abstracts.impl;

import com.imiracle.factory.abstracts.IDepartment;
import com.imiracle.factory.abstracts.IFactory;
import com.imiracle.factory.abstracts.IUser;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
