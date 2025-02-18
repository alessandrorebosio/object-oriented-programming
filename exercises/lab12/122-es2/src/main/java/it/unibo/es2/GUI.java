package it.unibo.es2;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    private final Map<JButton, Posistion<Integer, Integer>> buttons = new HashMap<>();
    private final Logics logics;

    public GUI(int size) {
        this.logics = new LogicsImpl(size);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(100 * size, 100 * size);

        JPanel panel = new JPanel(new GridLayout(size, size));
        this.getContentPane().add(BorderLayout.CENTER, panel);

        ActionListener al = (e) -> {
            final JButton bt = (JButton) e.getSource();
            final Posistion<Integer, Integer> p = buttons.get(bt);
            System.err.println(p);

            bt.setText(logics.hit(p.x(), p.y()) ? "*" : " ");
            if (logics.fullRow() || logics.fullCol()) {
                System.exit(1);
            }
        };

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                final JButton jb = new JButton(" ");
                jb.addActionListener(al);
                this.buttons.put(jb, new Posistion<Integer, Integer>(i, j));
                panel.add(jb);
            }
        }
        this.setVisible(true);
    }
}
