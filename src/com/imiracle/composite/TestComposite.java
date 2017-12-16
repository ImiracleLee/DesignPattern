package com.imiracle.composite;

public class TestComposite {
    public static void main(String[] args) {
//        createComposite();
        createCompany();
    }

    private static void createCompany() {
        ConcreteCompany root = new ConcreteCompany("Beijing Head Office");
        root.add(new HRDepartment("Head Office HR Department"));
        root.add(new FinanceDepartment("Head Office Finance Department"));

        ConcreteCompany sh = new ConcreteCompany("Shanghai Branch Office");
        sh.add(new HRDepartment("Shanghai Branch Office HR Department"));
        sh.add(new FinanceDepartment("Shanghai Branch Office Finance Department"));
        root.add(sh);

        ConcreteCompany nj = new ConcreteCompany("Nanjing Office");
        nj.add(new HRDepartment("Nanjing Office HR Department"));
        nj.add(new FinanceDepartment("Nanjing Office Finance Department"));
        root.add(nj);

        ConcreteCompany hz = new ConcreteCompany("Hangzhou Office");
        hz.add(new HRDepartment("Hangzhou Office HR Department"));
        hz.add(new FinanceDepartment("Hangzhou Office Finance Department"));
        root.add(hz);

        System.out.println("Structure:");
        root.display(1);
        System.out.println("Duty");
        root.lineOfDuty();
    }

    private static void createComposite() {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);

        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));
        root.add(comp2);

        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(0);
    }
}
