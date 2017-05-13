package com.ewaste.business.helper;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class MyComponent extends JComponent {

    int a, b, c, d;

    public MyComponent(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    Slice[] slices = {new Slice(a, Color.black),
        new Slice(b, Color.green),
        new Slice(c, Color.yellow),
        new Slice(d, Color.red)};

    public void paint(Graphics g) {
        drawPie((Graphics2D) g, getBounds(), slices);
    }

    void drawPie(Graphics2D g, Rectangle area, Slice[] slices) {
        double total = 0.0D;
        for (int i = 0; i < slices.length; i++) {
            total += slices[i].value;
        }
        System.out.println(area);
        double curValue = 0.0D;
        int startAngle = 0;
        for (int i = 0; i < slices.length; i++) {
            startAngle = (int) (curValue * 360 / total);
            int arcAngle = (int) (slices[i].value * 360 / total);
            g.setColor(slices[i].color);
            g.fillArc(20, 10, 175, 125,
                    startAngle, arcAngle);
            curValue += slices[i].value;
        }
    }
}
