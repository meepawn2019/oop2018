package week5_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Layer extends JPanel implements  ActionListener{
    private static final int D_W = 500;
    private static final int D_H = 1000;
        private List<Shape> listShape;
    Timer timer;

    Layer(){
            listShape = new ArrayList<>();
            listShape.add(new Circle(Color.BLUE, true,100, 200, 10));
            listShape.add(new Circle(Color.red, true, 500, 500, 20));
            listShape.add(new Triangle(Color.BLACK, true, new Point(10, 20), new Point(60, 40), new Point(120, 40)));
            Timer timer = new Timer(15, this);
            timer.start();
        }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Shape shape : listShape){
            shape.draw(g);
        }
    }
    public void actionPerformed(ActionEvent e) {
        for (Shape shape : listShape) {
            shape.move(getWidth(), getHeight());
        }
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(D_W, D_H);
    }

   public void randomAdd(){
         Random random = new Random();
         int  n1 = random.nextInt(200) + 1;
         int  n2 = random.nextInt(200) + 1;
       Random rand = new Random();
         float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color randomColor = new Color(r, g, b);
         Shape a = new Circle(randomColor, true, n1, n2, rand.nextInt(150));
         listShape.add(a);
         System.out.println("TEST");
    }

    public void deleteCircle(){
        List<Shape> toRemove = new ArrayList<>();
        for(Shape a: listShape){
            if(a instanceof  Circle){
                toRemove.add(a);
            }
        }
        listShape.removeAll(toRemove);
    }


}
