package com.imiracle.command;

public abstract class Command {
    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    abstract void executeCommand();
}
