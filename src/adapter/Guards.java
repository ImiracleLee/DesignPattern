package adapter;

/**
 * Created by Imiracle Lee on 2017/9/16.
 */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Guards " + name + " Attack!");
    }

    @Override
    public void defense() {
        System.out.println("Guards " + name + " Defense!");
    }
}
