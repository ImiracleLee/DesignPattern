package com.imiracle.composite;

public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        Utils.displayLeaf(depth, name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + " : Finance Department!");
    }
}
