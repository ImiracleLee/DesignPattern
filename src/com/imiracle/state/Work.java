package com.imiracle.state;

/**
 * Created by Imiracle Lee on 2017/9/15.
 */
public class Work {
    private State state;
    private double hour;
    private boolean finish;

    public Work(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void writeProgram() {
        state.writePrograme(this);
    }
}
