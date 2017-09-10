package builder;

import java.awt.*;

/**
 * 创建一个Project对象的各个部件指定的接口
 * Created by Imiracle Lee on 2017/9/10.
 */
public abstract class PersonBuilder {
    Graphics graphics;

    public PersonBuilder(Graphics graphics) {
        this.graphics = graphics;
    }

    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildArmLeft();

    public abstract void buildArmRight();

    public abstract void buildLegLeft();

    public abstract void buildLegRight();
}
