package com.imiracle.builder;

import java.awt.*;

/**
 * 具体建造者
 * Created by Imiracle Lee on 2017/9/10.
 */
public class PersonThinBuilder extends PersonBuilder {
    public PersonThinBuilder(Graphics graphics) {
        super(graphics);
    }

    @Override
    public void buildHead() {
        graphics.drawOval(50, 20, 30, 30);
    }

    @Override
    public void buildBody() {
        graphics.drawRect(60, 50, 10, 50);
    }

    @Override
    public void buildArmLeft() {
        graphics.drawLine(60, 50, 40, 100);
    }

    @Override
    public void buildArmRight() {
        graphics.drawLine(70, 50, 90, 100);
    }

    @Override
    public void buildLegLeft() {
        graphics.drawLine(60, 100, 45, 150);
    }

    @Override
    public void buildLegRight() {
        graphics.drawLine(70, 100, 85, 150);
    }
}
