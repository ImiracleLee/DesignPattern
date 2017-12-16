package com.imiracle.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 登记式单例
 */
public class RegisterSingleton {
    private static Map<String, RegisterSingleton> map = new HashMap<>();

    static {
        RegisterSingleton singleton = new RegisterSingleton();
        map.put(singleton.getClass().getName(), singleton);
    }

    private RegisterSingleton() {
    }

    public static RegisterSingleton getInstance(String name) {
        if (name == null) {
            name = RegisterSingleton.class.getName();
        }
        if (map.get(name) == null) {
            try {
                map.put(name, (RegisterSingleton) Class.forName(name).newInstance());
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }

    public static void main(String[] args) {
        RegisterSingleton.getInstance(null);
    }

}
