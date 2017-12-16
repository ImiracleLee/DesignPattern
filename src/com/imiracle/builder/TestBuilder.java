package com.imiracle.builder;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Imiracle Lee on 2017/9/10.
 */
public class TestBuilder {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Container container = frame.getContentPane();
        JPanel thin = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                new PersonDirector(new PersonThinBuilder(g)).createPerson();
//                new PersonDirector(new PersonFatBuilder(g)).createPerson();
            }
        };
        container.add(thin);

        frame.setTitle("Person");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
