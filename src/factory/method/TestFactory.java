package factory.method;

import factory.method.impl.FactoryAdd;
import factory.method.impl.FactoryPower;

/**
 * Created by Imiracle Lee on 2017/9/7.
 */
public class TestFactory {
    public static void main(String[] args) {
        Factory factory = new FactoryAdd();
        Operation operation = factory.createFactory();

        operation.setNumber1(1);
        operation.setNumber2(2);
        System.out.println(operation.getResult());

        factory = new FactoryPower();
        operation = factory.createFactory();

        operation.setNumber1(3);
        operation.setNumber2(3);
        System.out.println(operation.getResult());
    }
}
