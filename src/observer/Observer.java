package observer;

/**
 * 抽象观察者，为所有具体观察者定义一个接口
 * 使用委托，就用不到这个类了
 * Created by Imiracle Lee on 2017/9/11.
 */
public abstract class Observer {
    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
