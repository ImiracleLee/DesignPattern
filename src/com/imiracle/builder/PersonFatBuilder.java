package com.imiracle.builder;

import java.awt.*;

/**
 * 具体建造者
 * Created by Imiracle Lee on 2017/9/10.
 */
public class PersonFatBuilder extends PersonBuilder {
    public PersonFatBuilder(Graphics graphics) {
        super(graphics);
    }

    @Override
    public void buildHead() {
        graphics.drawOval(50, 20, 30, 30);
    }

    @Override
    public void buildBody() {
        graphics.drawRect(50, 50, 30, 50);
    }

    @Override
    public void buildArmLeft() {
        graphics.drawLine(50, 50, 30, 100);
    }

    @Override
    public void buildArmRight() {
        graphics.drawLine(80, 50, 100, 100);
    }

    @Override
    public void buildLegLeft() {
        graphics.drawLine(50, 100, 35, 150);
    }

    @Override
    public void buildLegRight() {
        graphics.drawLine(80, 100, 95, 150);
    }
}
