package com.imiracle.command;

public class CommandTest {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        Command commandMutton = new Command(barbecuer) {
            @Override
            void executeCommand() {
                barbecuer.bakeMutton();
            }
        };
        Command commandChickenWing = new Command(barbecuer) {
            @Override
            void executeCommand() {
                barbecuer.bakeChickenWing();
            }
        };
        Waiter waiter = new Waiter();

        waiter.setOrder(commandMutton);
        waiter.setOrder(commandChickenWing);
        waiter.notifyCommand();
    }
}
