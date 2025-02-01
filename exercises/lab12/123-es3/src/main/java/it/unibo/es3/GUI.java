package it.unibo.es3;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class GUI extends JFrame {

    private final List<JButton> cells = new ArrayList<>();

    public GUI(int width) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(70 * width, 70 * width);

        JPanel panel = new JPanel(new GridLayout(width, width));

        JButton button = new JButton(">");
        button.addActionListener(e -> {
            System.err.println("ciao");
        });

        this.getContentPane().add(BorderLayout.CENTER, panel);
        this.getContentPane().add(BorderLayout.SOUTH, button);
        this.getContentPane().add(panel);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                final JButton jb = new JButton();
                jb.setEnabled(false);
                this.cells.add(jb);
                panel.add(jb);
            }
        }
        this.setVisible(true);
    }

}