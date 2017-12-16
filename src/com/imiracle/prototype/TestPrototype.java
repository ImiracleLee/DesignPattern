package com.imiracle.prototype;

/**
 * Created by Imiracle Lee on 2017/9/7.
 */
public class TestPrototype {
    public static void main(String[] args) {
        Resume a = new Resume("Name");
        a.setPersonalInfo("M", "24");
        a.setWorkExperience("2012-2016", "XX company");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("2016-2017", "YY company");

        Resume c = (Resume) a.clone();
        c.setPersonalInfo("M", "25");

        a.display();
        b.display();
        c.display();
    }
}
