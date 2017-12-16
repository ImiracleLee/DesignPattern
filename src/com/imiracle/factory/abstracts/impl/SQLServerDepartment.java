package com.imiracle.factory.abstracts.impl;

import com.imiracle.factory.abstracts.Department;
import com.imiracle.factory.abstracts.IDepartment;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class SQLServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("Insert Department into SQLServer!");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("Get Department from SQLServer!");
        return null;
    }
}
