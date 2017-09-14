package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class Boss implements Subject {
    private EventHandler handler = new EventHandler();

    private List<Observer> observers = new ArrayList<>();

    private String action;

    public EventHandler getHandler() {
        return handler;
    }

    public void setHandler(EventHandler handler) {
        this.handler = handler;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notice() {
        this.getHandler().notifyX();
    }

    @Override
    public void addListener(Object object, String methodName, Object... params) {
        EventHandler handler = this.getHandler();
        handler.addEvent(object, methodName, params);
    }
}
