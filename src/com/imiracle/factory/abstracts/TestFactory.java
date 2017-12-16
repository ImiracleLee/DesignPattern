package com.imiracle.factory.abstracts;

import com.imiracle.factory.abstracts.impl.AccessFactory;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class TestFactory {

    public static void main(String[] args) {
        IFactory factory = new AccessFactory();

        User user = new User();
//        IUser iu = factory.createUser();
        IUser iu = DataAccess.createUser();
        iu.insert(user);
        iu.getUser(0);

        Department department = new Department();
        IDepartment id = factory.createDepartment();
        id.insert(department);
        id.getDepartment(0);
    }
}
