package hspedu.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 掩饰小球通过键盘控制上下左右的移动，（java的事件控制）
 */
public class BallMove extends JFrame{// 窗口
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();


    }

    // 构造器
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

// 面板，可以画出小球
// keyListener 是监听键盘时间
class MyPanel extends JPanel implements KeyListener {

    // 为了让小球可以移动，把它放左上角的坐标更改
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }
    // 有字符输出时 ，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }
    // 当某个键按下，该方法就会触发
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println((char)e.getKeyCode()+"被按下...");

        // 根据用户按下不同的键，来处理小球的移动
        // 在java中，会给每一个键分配一个值
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            y = y+2;
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            y = y-2;
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x = x-2;
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x = x+2;
        }
        // 让面板重绘
        this.repaint();
    }
    // 当某个键松开，该方法会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}