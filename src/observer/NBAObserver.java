package observer;

/**
 * Created by Imiracle Lee on 2017/9/11.
 */
public class NBAObserver {
    protected String name;
    protected Subject subject;

    public NBAObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void closeNBADirectSeeding() {
        System.out.println(subject.getAction() + name + ", close NBA, working!");
    }
}
