/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author student
 */
public class Panel extends JPanel implements MouseListener, MouseMotionListener {

    ArrayList<Figura> lista;
    
    private int x, y;

    public Panel() {
        addMouseListener(this);
        addMouseMotionListener(this);
        lista = new ArrayList<Figura>();
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("wyjechano poza");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("wjechano na");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("wcisnieto przycisk myszy");

        //repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("puszczono przycisk myszy");

        //repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        lista.add(new Kolko(e.getX(), e.getY()));
        repaint();
    }
    
    @Override
    public void mouseDragged(MouseEvent e){

        //repaint();
    } 
    
    @Override
    public void mouseMoved(MouseEvent e){
        
    }

    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, getSize().width, getSize().height);
        for (Figura figura:lista)
            figura.paint(g);
        
    }

}
