package com.imiracle.factory.abstracts;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class DataAccess {
    private static String db = "SQLServer";

    static {
        Properties properties = new Properties();
        try (InputStream reader = DataAccess.class.getResourceAsStream("db.properties")) {
            properties.load(reader);
            db = properties.getProperty("db");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static IUser createUser() {
        String className = "factory.abstracts.impl." + db + "User";
        try {
            return (IUser) Class.forName(className).getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public IDepartment createDepartment() {
        String className = "factory.abstracts.impl." + db + "Department";
        try {
            return (IDepartment) Class.forName(className).getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
