package factory;

import factory.impl.OperationAdd;
import factory.impl.OperationDiv;
import factory.impl.OperationMuti;
import factory.impl.OperationSub;

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
