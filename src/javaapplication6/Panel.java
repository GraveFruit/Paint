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

    private int x, y, x1, y1;

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
        this.x = e.getX();
        this.y = e.getY();

        //repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("puszczono przycisk myszy");
        this.x1 = e.getX();
        this.y1 = e.getY();
        lista.add(new Linia(x,y,x1,y1));
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        lista.add(new Kolko(e.getX(), e.getY()));
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        //repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, getSize().width, getSize().height);
        for (Figura figura : lista) {
            figura.paint(g);
        }

    }

}
