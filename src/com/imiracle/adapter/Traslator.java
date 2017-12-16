package com.imiracle.adapter;

/**
 * 适配器，适配ForeignCenter和Center
 * Created by Imiracle Lee on 2017/9/16.
 */
public class Traslator extends Player {
    private ForeignCenter center = new ForeignCenter();

    public Traslator(String name) {
        super(name);
        center.setName(name);
    }

    @Override
    public void attack() {
        center.attackF();
    }

    @Override
    public void defense() {
        center.defenseF();
    }
}
