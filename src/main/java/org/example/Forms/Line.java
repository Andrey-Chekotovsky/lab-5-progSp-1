package org.example.Forms;

import lombok.Data;

import java.awt.*;

@Data
public class Line {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int a;
    private int b;
    private int c;
    public Line(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        a = (y1 - y2) ;
        b = (x2 - x1);
        c = (x1*y2 - x2*y1);
    }
    public void drawLine(Graphics graphics) {
        Graphics2D g  = (Graphics2D) graphics;
        g.setColor(Color.BLACK);
        g.setPaintMode();
        g.drawLine(x1, y1, x2, y2);
    }
}
