package com.imiracle.command;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Waiter {
    private List<Command> orderList = new ArrayList<>();

    public void setOrder(Command command) {
        orderList.add(command);
        System.out.println("Set Command : " + command + ", Time : " + LocalTime.now());
    }

    public void cancelOrder(Command command) {
        orderList.remove(command);
        System.out.println("Cancel Command : " + command + ", Time : " + LocalTime.now());
    }

    public void notifyCommand() {
        orderList.forEach(command -> command.executeCommand());
    }
}
