package state;

/**
 * Created by Imiracle Lee on 2017/9/16.
 */
public class RestState implements State {
    @Override
    public void writePrograme(Work work) {
        System.out.println("Time : " + work.getHour() + " Rest!");
    }
}
