package memento;

/**
 * 发起人，负责创建备忘录以记录状态，并可以恢复
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建备忘录
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 恢复备忘录
     *
     * @param memento
     */
    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println("State : " + state);
    }
}
