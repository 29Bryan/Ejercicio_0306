/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 * @author PCG
 */
public class PanelPrincipal extends JPanel implements MouseListener {

    private Color color1;
    private int dibujo;
    private int x;
    private int y;
    private Point punto = new Point(-100, -100);

    public PanelPrincipal() {

        this.addMouseListener(this);
    }

    public void dibujos(int dibujo, int x, int y, Color color1) {
        this.dibujo = dibujo;
        this.x = x;
        this.y = y;
        this.color1 = color1;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(this.color1);
        if (dibujo == 0) {
            int[] xPoints = {x, x+10, x+40, x+15, x+25, x, x-25, x-15, x-40, x-10};
            int[] yPoints = {y, y+35, y+35, y+55, y+90, y+70, y+90, y+55, y+35, y+35};
            int nPuntos = y/2;
            g.fillPolygon(xPoints, yPoints, nPuntos);
        } else if (dibujo == 1) {
            g.fillOval(this.punto.x - 10, this.punto.y - 10, x, y);
        } else if (dibujo == 2) {
            g.fillRect(this.punto.x - 10, this.punto.y - 10, x, y);
        } else if (dibujo == 3) {
            g.fillRect(this.punto.x - 10, this.punto.y - 10, x, y);
        } else if (dibujo == 4) {
            int[] xPoints = {x, x+200, x-150};
            int[] yPoints = {y, y+150, y+150};
            int nPuntos = y/2;
            g.fillPolygon(xPoints, yPoints, nPuntos);
        }

    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

//    public Color getColor2() {
//        return color2;
//    }
//
//    public void setColor2(Color color2) {
//        this.color2 = color2;
//    }
//
//    public Color getColor3() {
//        return color3;
//    }
//
//    public void setColor3(Color color3) {
//        this.color3 = color3;
//    }
    @Override
    public void mouseClicked(MouseEvent e) {
//        System.out.println(e.toString());
//        
//        this.numClick++; 
//        
//        System.out.println(e.getClickCount());
//        
//        if(this.numClick==1){
//            punto1 = e.getPoint();    
//        }
//        
//        if(this.numClick == 2){
//            punto2 = e.getPoint(); 
//            numClick = 0; 
//            this.repaint();
//        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e.toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(e.getX());
        System.out.println(e.getY());
        System.out.println(e.getPoint());
        System.out.println(e.getButton());
        this.punto = e.getPoint();
        this.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(e.toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println(e.toString());
    }
}
