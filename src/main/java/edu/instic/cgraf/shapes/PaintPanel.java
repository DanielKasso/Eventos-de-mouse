/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.instic.cgraf.shapes;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author D.N.Kasso
 */
public class PaintPanel extends JPanel{
     // lista das referências Point     
    private final ArrayList<Point> points = new ArrayList<>();
  
    // configura GUI e registra rotinas de tratamento de evento de mouse
    public PaintPanel()
    {
        // trata evento de movimento de mouse do frame
//        addMouseMotionListener(new MouseMotionAdapter() // classe interna anônima
//            {  
//                // armazena coordenadas da ação de arrastar e repinta                       
//                @Override
//                public void mouseDragged(MouseEvent event)
//                {                                                           
//                     points.add(event.getPoint());
//                     repaint(); // repinta JFrame                 
//                }                                 
//            } 
//        ); 
        
//        addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                points.add(e.getPoint());
//                repaint(); // Refresh the panel to draw the new point
//            }
//        });
        MouseHandler handler = new MouseHandler();
        this.addMouseMotionListener(handler);
     } 
      
     // desenha ovais em um quadro delimitador de 4 x 4 nas localizações especificadas na janela
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); // limpa a área de desenho
        // desenha todos os pontos 
        for (Point point : points)
            //g.fillOval(point.x, point.y, 4, 4);
            g.fillOval(point.x, point.y, 10, 10);
    }
    
    private class MouseHandler extends MouseMotionAdapter{
        @Override
        public void mouseDragged(MouseEvent event){
            points.add(event.getPoint());
            repaint(); // repaint();
        }
    }
 } // fim da classe PaintPanel

