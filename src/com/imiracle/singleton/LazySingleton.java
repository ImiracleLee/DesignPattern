package com.imiracle.singleton;

/**
 * 饿汉式单例
 */
public class LazySingleton {
    private static final LazySingleton SINGLETON = new LazySingleton();

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        return SINGLETON;
    }

    public static void main(String[] args) {
        LazySingleton.getInstance();
    }
}
