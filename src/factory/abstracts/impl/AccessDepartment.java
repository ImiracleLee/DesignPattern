package factory.abstracts.impl;

import factory.abstracts.Department;
import factory.abstracts.IDepartment;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("Insert Department into Access!");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("Get Department from Access!");
        return null;
    }
}
