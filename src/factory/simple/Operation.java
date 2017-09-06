package factory.simple;

/**
 * Created by Imiracle Lee on 2017/9/4.
 */
public abstract class Operation {
    protected double number1;

    protected double number2;

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public abstract double getResult();
}
