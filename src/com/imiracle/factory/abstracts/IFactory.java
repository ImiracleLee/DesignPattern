package com.imiracle.factory.abstracts;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}
