package com.imiracle.state;

/**
 * Created by Imiracle Lee on 2017/9/16.
 */
public class AfternoonState implements State {
    @Override
    public void writePrograme(Work work) {
        if (work.getHour() < 17) {
            System.out.println("Time : " + work.getHour() + " Afternoon!");
        } else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
