package org.example.Forms;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;
import java.awt.geom.Point2D;

@Data
@AllArgsConstructor
public class Circle {
    private int x;
    private int y;
    private int radius;

    public boolean isCollide(Line line){
        double dist = 1.0 * Math.abs(line.getA() * x + line.getB() * y + line.getC()) /
                Math.sqrt(line.getA() * line.getA() +  line.getB() * line.getB());
        if (radius >= dist) {
            return true;
        } else {
            return false;
        }
    }
    public void drawCenteredCircle(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        int x = this.x - (radius/2);
        int y = this.y -(radius/2);
        g.fillOval(x,y,radius,radius);
    }
}
