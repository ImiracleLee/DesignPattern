package state;

/**
 * Created by Imiracle Lee on 2017/9/16.
 */
public class EveningState implements State {
    @Override
    public void writePrograme(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.writeProgram();
        } else if (work.getHour() < 21) {
            System.out.println("Time : " + work.getHour() + " Evening!");
        } else {
            work.setState(new SleepingState());
            work.writeProgram();
        }
    }
}
