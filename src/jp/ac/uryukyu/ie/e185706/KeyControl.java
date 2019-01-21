package jp.ac.uryukyu.ie.e185706;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class KeyControl extends JFrame implements KeyListener {

    public KeyControl(String title, int width, int height) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);


        addKeyListener(this);
    }


    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {

    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_1:
                System.out.println("1");
                break;
            case KeyEvent.VK_2:
                System.out.println("2");
                break;
            case KeyEvent.VK_3:
                System.out.println("3");
                break;
            case KeyEvent.VK_ENTER:
                System.out.println("Enter");
                break;

        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
