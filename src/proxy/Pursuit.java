package proxy;

/**
 * Created by Imiracle Lee on 2017/9/6.
 */
public class Pursuit implements GiveGift {
    SchoolGirl girl;

    public Pursuit(SchoolGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(girl.getName() + " Dolls");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.getName() + " Flowers");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + " Chocolate");
    }
}
