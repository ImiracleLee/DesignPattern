package iterator;

/**
 * 反序迭代器实现类
 */
public class ConcreteIteratorDesc implements Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.count() - 1;
    }

    @Override
    public Object first() {
        return aggregate.getItems(0);
    }

    @Override
    public Object next() {
        current--;
        if (current >= 0) {
            return aggregate.getItems(current);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return current < 0;
    }

    @Override
    public Object currentItem() {
        return aggregate.getItems(current);
    }
}
