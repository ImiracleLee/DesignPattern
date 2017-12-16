package com.imiracle.composite;

/**
 * 叶节点对象
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        System.out.println("Cannot add to a leaf!");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Cannot remove from a leaf!");
    }

    @Override
    public void display(int depth) {
        Utils.displayLeaf(depth, name);
    }
}
