package state;

/**
 * Created by Imiracle Lee on 2017/9/16.
 */
public class TestState {
    public static void main(String[] args) {
        Work work = new Work(new ForenoonState());
        work.setHour(9);
        work.writeProgram();
        work.setHour(11);
        work.writeProgram();
        work.setHour(12.5);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);
        work.writeProgram();
        work.setHour(20);
        work.writeProgram();
        work.setHour(22);
        work.setFinish(true);
        work.writeProgram();
    }
}
