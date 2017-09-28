package memento;

public class GameRoleOrigintor {
    private int vit;//生命力
    private int atk;//攻击力
    private int def;//防御力

    /**
     * 保存进度
     *
     * @return
     */
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    public void recoveryState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    /**
     * role初始状态，全部满血
     */
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    /**
     * role大战Boss后，残血
     */
    public void fight() {
        this.vit = 10;
        this.atk = 30;
        this.def = 20;
    }

    /**
     * 显示状态
     */
    public void displayState() {
        System.out.println("Vitality : " + vit + " Attack : " + atk + " Defense : " + def);
    }
}
