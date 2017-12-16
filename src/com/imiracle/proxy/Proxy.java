package com.imiracle.proxy;

/**
 * Created by Imiracle Lee on 2017/9/6.
 */
public class Proxy implements GiveGift {
    Pursuit pursuit;

    /**
     * 代理构造器
     *
     * @param girl
     */
    public Proxy(SchoolGirl girl) {
        pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
