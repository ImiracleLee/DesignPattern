package com.imiracle.adapter;

/**
 * Created by Imiracle Lee on 2017/9/16.
 */
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attackF() {
        System.out.println("ForeignCenter " + name + " Attack!");
    }

    public void defenseF() {
        System.out.println("ForeignCenter " + name + " Defense!");
    }
}
