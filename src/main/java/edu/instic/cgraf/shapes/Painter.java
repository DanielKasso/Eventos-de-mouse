/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.instic.cgraf.shapes;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author D.N.Kasso
 */
public class Painter {
    
    public static void main(String[] args){
        JFrame application = new JFrame("Desenhar com o mouse");
        PaintPanel paintPanel = new PaintPanel();
        
        application.add(paintPanel); 
        
        // cria um rótulo e o coloca em SOUTH do BorderLayout
        application.add(new JLabel("Movimentar o mouse para desenhar"), BorderLayout.SOUTH);
  
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 200); 
        application.setVisible(true); 
    }
}
