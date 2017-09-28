package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 聚集实现类
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getItems(int i) {
        return items.get(i);
    }

    public void setItems(int i, Object item) {
        items.add(i, item);
    }

    public int count() {
        return items.size();

    }
}
