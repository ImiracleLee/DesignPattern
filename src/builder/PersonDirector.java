package builder;

/**
 * 指挥者，构建一个使用Builder接口的对象
 * Created by Imiracle Lee on 2017/9/10.
 */
public class PersonDirector {
    private PersonBuilder builder;

    public PersonDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    public void createPerson() {
        builder.buildHead();
        builder.buildBody();
        builder.buildArmLeft();
        builder.buildArmRight();
        builder.buildLegLeft();
        builder.buildLegRight();
    }
}
