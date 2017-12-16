package com.imiracle.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 枝节点行为，用来存储子组件
 */
public class Composite implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        Utils.displayLeaf(depth, name);
        children.forEach(c -> c.display(depth + 2));
    }
}
