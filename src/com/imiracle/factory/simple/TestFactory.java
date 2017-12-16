package com.imiracle.factory.simple;

/**
 * Created by Imiracle Lee on 2017/9/4.
 */
public class TestFactory {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperate('+');
        operation.setNumber1(1);
        operation.setNumber2(2);
        System.out.println(operation.getResult());
    }
}
