package decorator;

/**
 * Created by Imiracle Lee on 2017/9/5.
 */
public class TestDecorator {
    public static void main(String[] args) {
        Person person = () -> System.out.println("Person's Show");

        System.out.println("First : ");

        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);
        bigTrouser.show();
    }
}
