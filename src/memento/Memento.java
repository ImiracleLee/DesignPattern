package memento;

/**
 * 负责存储Originator的内部状态，防止Originator以外的对象访问Memento
 */
public class Memento {
    private String state;

    /**
     * 获取需要保存的数据的属性
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * 构造方法，将相关数据导入
     *
     * @param state
     */
    public Memento(String state) {
        this.state = state;
    }
}
