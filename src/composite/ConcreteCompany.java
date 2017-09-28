package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 正序迭代器实现类
 */
public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        Utils.displayLeaf(depth, name);
        children.forEach(c -> c.display(depth + 2));
    }

    @Override
    public void lineOfDuty() {
        children.forEach(c -> c.lineOfDuty());
    }
}
