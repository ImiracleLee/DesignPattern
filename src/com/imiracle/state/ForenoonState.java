package com.imiracle.state;

/**
 * Created by Imiracle Lee on 2017/9/16.
 */
public class ForenoonState implements State {
    @Override
    public void writePrograme(Work work) {
        if (work.getHour() < 12) {
            System.out.println("Time : " + work.getHour() + " Forenoon!");
        } else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
