package com.imiracle.observer;

/**
 * 把所有对观察者对象的引用保存在一个聚集里
 * Created by Imiracle Lee on 2017/9/10.
 */
public interface Subject {

    String getAction();

    void setAction(String action);

    void attach(Observer observer);

    void detach(Observer observer);

    void notice();

    void addListener(Object object, String methodName, Object... params);
}
