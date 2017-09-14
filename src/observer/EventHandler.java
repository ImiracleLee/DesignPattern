package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class EventHandler {
    private List<Event> objects = new ArrayList<>();

    public void addEvent(Object object, String methodName, Object... params) {
        objects.add(new Event(object, methodName, params));
    }

    public void notifyX() {
        for (Event event : objects) {
            event.invoke();
        }
    }
}
