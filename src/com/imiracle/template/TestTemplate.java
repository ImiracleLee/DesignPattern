package com.imiracle.template;

/**
 * Created by Imiracle Lee on 2017/9/7.
 */
public class TestTemplate {
    public static void main(String[] args) {
        TestPaper a = new TestPaperA();
        a.testQuestion1();
        a.testQuestion2();

        TestPaper b = new TestPaperB();
        b.testQuestion1();
        b.testQuestion2();
    }
}
