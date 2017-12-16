package com.imiracle.adapter;

/**
 * Created by Imiracle Lee on 2017/9/16.
 */
public class TestAdapter {
    public static void main(String[] args) {
        Player f = new Forwards("F");
        f.attack();
        Player g = new Guards("G");
        g.attack();
        Player ym = new Traslator("YM");
        ym.attack();
        ym.defense();
    }
}
