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
 *
 * @author PCG
 */
public class PanelPrincipal extends JPanel implements MouseListener{
    
    
    private Color color1;

    private Point punto=new Point(-100,-100);

    public PanelPrincipal(Color color1) {
        this.color1 = color1;

        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);  
//        g.setColor(this.color1);
//        g.drawLine(0, 0, 600, 600);
//        g.setColor(this.color1);
//        g.fillOval(0, 0, 300, 300);
        g.setColor(this.color1);
        g.fillRect(this.punto.x-10, this.punto.y-10, 30, 20);
//        g.setColor(this.color1);
//        g.fillOval(this.punto.x-10, this.punto.y-10, 20, 20);

        
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
        this.punto=e.getPoint();
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
