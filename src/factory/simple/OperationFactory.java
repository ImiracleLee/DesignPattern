package factory.simple;

import factory.simple.impl.OperationAdd;
import factory.simple.impl.OperationDiv;
import factory.simple.impl.OperationMuti;
import factory.simple.impl.OperationSub;

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
