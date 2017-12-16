package com.imiracle.factory.abstracts.impl;

import com.imiracle.factory.abstracts.IUser;
import com.imiracle.factory.abstracts.User;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class SQLServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("Insert User into SQLServer!");
    }

    @Override
    public User getUser(int id) {
        System.out.println("Get User from SQLServer!");
        return null;
    }
}
