package andr7st;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.color.*;

public class Snake extends JFrame{

    int widht_ = 640;
    int height_ = 480;
    Point snake;

    ImagenSnake imagenSnake;

    int widthPoint  = 10; 
    int heightPoint = 10;

    public Snake () {
        
        this.setTitle("Snake | Andr7st");
        this.addKeyListener(new Teclas());

        this.setSize(widht_,height_);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // this.setLocationRelativeTo(null);
        this.setLocation(dim.width/2-widht_/2, dim.height/2-height_/2);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        snake = new Point(widht_/2, height_/2);

        imagenSnake = new ImagenSnake();
        this.getContentPane().add(imagenSnake);

        this.setVisible(true);
    }


    public class ImagenSnake extends JPanel {
        
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(new Color(0,0,255));
            g.fillRect(snake.x, snake.y, widthPoint, heightPoint);
        }
    } 



    public class Teclas extends KeyAdapter {
		///@Override
		public void keyPressed(KeyEvent e) {

            if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                System.exit(0);
            }
        }
    }
}