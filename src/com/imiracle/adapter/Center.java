package com.imiracle.adapter;

/**
 * Created by Imiracle Lee on 2017/9/16.
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Center " + name + " Attack!");
    }

    @Override
    public void defense() {
        System.out.println("Center " + name + " Defense!");
    }
}
