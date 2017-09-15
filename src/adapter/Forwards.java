package adapter;

/**
 * Created by Imiracle Lee on 2017/9/16.
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Forwards " + name + " Attack!");
    }

    @Override
    public void defense() {
        System.out.println("Forwards " + name + " Defense!");
    }
}
