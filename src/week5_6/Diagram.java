package src;


import jdk.jshell.Diag;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class Diagram extends KeyAdapter implements KeyListener {
    Layer test = new Layer();

    public Diagram() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.add(test);
            frame.addKeyListener(this);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    @Override
   public void keyPressed(KeyEvent e){
        if(e.getKeyCode()== KeyEvent.VK_SPACE){
            test.randomAdd();
        }
        else if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
            test.deleteCircle();
        }
    }

    public static void main(String[] args){
        new Diagram();
    }
}