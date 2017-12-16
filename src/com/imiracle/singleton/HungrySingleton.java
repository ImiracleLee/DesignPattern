package com.imiracle.singleton;

/**
 * 懒汉式单例
 */
public class HungrySingleton {
    private static HungrySingleton singleton = null;

    private HungrySingleton() {
    }

    /**
     * 加锁，性能低
     *
     * @return
     */
    public static synchronized HungrySingleton getInstanceLock() {
        if (singleton == null) {
            singleton = new HungrySingleton();
        }
        return singleton;
    }

    /**
     * 双重加锁检查
     *
     * @return
     */
    public static HungrySingleton getInstanceDouLock() {
        if (singleton == null) {
            synchronized (HungrySingleton.class) {
                if (singleton == null) {
                    singleton = new HungrySingleton();
                }
            }
        }
        return singleton;
    }

    private static class LazyHolder {
        private static final HungrySingleton SINGLETON = new HungrySingleton();
    }

    /**
     * 静态内部类实现
     *
     * @return
     */
    public static final HungrySingleton getInstance() {
        return LazyHolder.SINGLETON;
    }

    public static void main(String[] args) {
        HungrySingleton.getInstance();
        HungrySingleton.getInstanceLock();
        HungrySingleton.getInstanceDouLock();
    }
}
