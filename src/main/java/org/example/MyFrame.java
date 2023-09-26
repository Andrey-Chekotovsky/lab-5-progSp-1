package org.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    MyFrame(){
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
