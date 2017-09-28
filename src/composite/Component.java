package composite;

/**
 * 声明接口用来管理子组件
 */
public interface Component {
    void add(Component component);

    void remove(Component component);

    void display(int depth);
}
