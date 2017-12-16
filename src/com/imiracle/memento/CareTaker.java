package com.imiracle.memento;

/**
 * 负责保存好备忘录，不能对备忘录的内容进行操作或检查
 */
public class CareTaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
