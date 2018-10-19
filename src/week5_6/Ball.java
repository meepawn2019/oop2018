package src;

import java.awt.*;

public class Ball {

    int x = 0;
    int y = 0; // Current ball position
    int dx = 4; // Increment on ball's x-coordinate
    int dy = 4; // Increment on ball's y-coordinate
    int radius = 15; // Ball radius

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Color color = new Color((int) (Math.random() * 256),
            (int) (Math.random() * 256), (int) (Math.random() * 256));

    public void drawBall(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius,
                radius * 2, radius * 2);
    }

    public void animate(int width, int height) {
        if (x < 0 || x > width) {
            dx = -dx;
        }
        if (y < 0 || y > height) {
            dy = -dy;
        }
        // Adjust ball position
        x += dx;
        y += dy;
    }
}