package com.imiracle.state;

/**
 * Created by Imiracle Lee on 2017/9/16.
 */
public class NoonState implements State {
    @Override
    public void writePrograme(Work work) {
        if (work.getHour() < 13) {
            System.out.println("Time : " + work.getHour() + " Noon!");
        } else {
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
