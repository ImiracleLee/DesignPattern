package factory.abstracts.impl;

import factory.abstracts.IDepartment;
import factory.abstracts.IFactory;
import factory.abstracts.IUser;

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
