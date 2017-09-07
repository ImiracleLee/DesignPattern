package template;

/**
 * Created by Imiracle Lee on 2017/9/7.
 */
public abstract class TestPaper {
    public void testQuestion1() {
        System.out.println("Question 1 : " + answer1());
    }

    protected abstract String answer1();

    public void testQuestion2() {
        System.out.println("Question 2 : " + answer2());
    }

    protected abstract String answer2();
}
