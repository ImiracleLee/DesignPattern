package memento;

public class TestMemento {
    public static void main(String[] args) {
//        mementoState();
        mementoRole();
    }

    /**
     * 游戏角色状态备忘
     */
    private static void mementoRole() {
        //初始状态
        GameRoleOrigintor role = new GameRoleOrigintor();
        role.initState();
        role.displayState();
        //保存游戏进度
        RoleStateCareTaker stateAdmin = new RoleStateCareTaker();
        stateAdmin.setMemento(role.saveState());
        //改变状态
        role.fight();
        role.displayState();
        //恢复初始状态
        role.recoveryState(stateAdmin.getMemento());
        role.displayState();
    }

    private static void mementoState() {
        //初始状态
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();
        //保存状态，隐藏了Originator的实现细节
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMemento());
        //改变状态
        originator.setState("off");
        originator.show();
        //恢复原始状态
        originator.setMemento(careTaker.getMemento());
        originator.show();
    }
}
