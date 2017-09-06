package factory.method;

import factory.method.impl.VolunteerFactory;

/**
 * Created by Imiracle Lee on 2017/9/7.
 */
public class TestLeifeng {
    public static void main(String[] args) {
        LeifengFactory factory = new VolunteerFactory();
        Leifeng volunteer = factory.createFactory();

        volunteer.buyRice();
        volunteer.sweep();
        volunteer.wash();
    }
}
