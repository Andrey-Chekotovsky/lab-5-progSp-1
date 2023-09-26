package org.example;

import org.example.Forms.Circle;
import org.example.Forms.Line;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    MyPanel(){
        this.setPreferredSize(new Dimension(1000, 1000));
    }
    @Override
    public void paint(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.setColor(Color.BLACK);
        Circle circle = new Circle(500, 500, 100);
        circle.drawCenteredCircle(g);
        Line line = new Line(0, 500, 0, 500);
        line.drawLine(g);
        System.out.println(circle.isCollide(line));
        line = new Line(500, 700, 500, 500);
        line.drawLine(g);
        System.out.println(circle.isCollide(line));
        line = new Line(100, 200, 100, 100);
        line.drawLine(g);
        System.out.println(circle.isCollide(line));
        System.out.println(circle.isCollide(line));
    }
}
