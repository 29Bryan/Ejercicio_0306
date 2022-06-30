/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author PCG
 */
public final class VentanaPrincipal extends JFrame implements ActionListener{
    
    private PanelPrincipal panelPrincipal1;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JButton jButton1;
    private JButton jButton2;
    
    public VentanaPrincipal(String title) throws HeadlessException {
        super(title);
        this.setSize(600, 600);
        this.iniciarComponentes();
        this.setLayout(new BorderLayout());
        
        this.add(this.jComboBox1,BorderLayout.NORTH);
        this.add(this.jComboBox2,BorderLayout.EAST);

        this.add(this.jButton1,BorderLayout.SOUTH);
        this.add(this.jButton2,BorderLayout.WEST);
        
        this.panelPrincipal1 = new PanelPrincipal(Color.WHITE);        
        this.add(this.panelPrincipal1,BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void iniciarComponentes(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Amarillo");
        this.jComboBox1.addItem("Azul");
        this.jComboBox1.addItem("Rojo");
        this.jComboBox1.addItem("Verde");
        
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("Estrella");
        this.jComboBox2.addItem("Circulo");
        this.jComboBox2.addItem("Cuadrado");
        this.jComboBox2.addItem("Rectangulo");
        this.jComboBox2.addItem("Triangulo");
        
        this.jButton1 = new JButton("Colorear");
        this.jButton1.addActionListener(this);
        this.jButton2 = new JButton("Eliminar");
        this.jButton2.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) { 
        if(this.jComboBox2.getSelectedIndex()==3){
            if(this.jComboBox1.getSelectedIndex()==0){
                
                this.panelPrincipal1.setColor1(Color.YELLOW);

                this.panelPrincipal1.repaint(); 
                if(e.getSource().equals(this.jButton2)){
                    System.out.println("Eliminado");
                    this.remove(this.panelPrincipal1);
                }  
            }
            
            if(this.jComboBox1.getSelectedIndex()==1)
            {
                this.panelPrincipal1.setColor1(Color.BLUE);

                this.panelPrincipal1.repaint();    
                
                if(e.getSource().equals(this.jButton2)){
                    System.out.println("Eliminado");
                    this.remove(this.panelPrincipal1);
                }
            }
            
            if(this.jComboBox1.getSelectedIndex()==2)
            {
                this.panelPrincipal1.setColor1(Color.RED);

                this.panelPrincipal1.repaint();      
                
                if(e.getSource().equals(this.jButton2)){
                    System.out.println("Eliminado");
                    this.remove(this.panelPrincipal1);
                }

            }
            if(this.jComboBox1.getSelectedIndex()==3)
            {
                this.panelPrincipal1.setColor1(Color.GREEN);

                this.panelPrincipal1.repaint();        
                
                if(e.getSource().equals(this.jButton2)){
                    System.out.println("Eliminado");
                    this.remove(this.panelPrincipal1);
                }
            }
        }
    }
}
