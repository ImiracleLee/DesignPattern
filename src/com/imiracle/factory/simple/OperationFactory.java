package com.imiracle.factory.simple;

import com.imiracle.factory.simple.impl.OperationAdd;
import com.imiracle.factory.simple.impl.OperationMuti;
import com.imiracle.factory.simple.impl.OperationSub;
import com.imiracle.factory.simple.impl.OperationDiv;

/**
 * Created by Imiracle Lee on 2017/9/4.
 */
public class OperationFactory {
    public static Operation createOperate(char operate) {
        Operation operation = null;
        switch (operate) {
            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
            case '*':
                operation = new OperationMuti();
                break;
            case '/':
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
