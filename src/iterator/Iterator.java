package iterator;

/**
 * 迭代器接口
 */
public interface Iterator {
    Object first();

    Object next();

    boolean isDone();

    Object currentItem();
}
