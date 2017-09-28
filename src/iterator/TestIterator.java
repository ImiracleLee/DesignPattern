package iterator;

public class TestIterator {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.setItems(0, "A0");
        aggregate.setItems(1, "A1");
        aggregate.setItems(2, "A2");

//        Iterator iterator = new ConcreteIterator(aggregate);
        Iterator iterator = new ConcreteIteratorDesc(aggregate);
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
