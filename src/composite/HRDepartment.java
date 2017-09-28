package composite;

public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        Utils.displayLeaf(depth, name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + " : HR Department!");
    }
}
