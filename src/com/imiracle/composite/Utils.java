package com.imiracle.composite;

public class Utils {
    public static void displayLeaf(int depth, String name) {
        StringBuffer buffer = new StringBuffer("|");
        for (int i = 0; i < depth; i++) {
            buffer.append('-');
        }
        System.out.println(buffer + name);
    }
}
