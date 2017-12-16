package com.imiracle.adapter;

/**
 * Created by Imiracle Lee on 2017/9/16.
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
