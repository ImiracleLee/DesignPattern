package com.imiracle.bridge;

public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    abstract void run();
}
