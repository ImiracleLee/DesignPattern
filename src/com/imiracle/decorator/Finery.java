package com.imiracle.decorator;

/**
 * Created by Imiracle Lee on 2017/9/5.
 */
public class Finery implements Person {
    protected Person person;

    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
