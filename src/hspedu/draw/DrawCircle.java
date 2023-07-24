package hspedu.draw;

import javax.swing.*;
import java.awt.*;

/**
 * Graphics类
 * Graphics类你可以理解就是画笔,为我们提供了各种绘制图形的方法
 * 1.画直线 drawLine(int x1,int y1,int x2,int y2)
 * 2.画矩形边框 drawRect(int x int y int width, int height)
 * 3.画椭圆边框 drawOval(int x,int y,int width int height)
 * 4.填充矩形 fillRect(int x,int y, int width, int height)
 * 5.填充椭圆 fillOval(int x,int y,int width, int height)
 * 6. 画字符串 drawString(String str,int x,int y)
 * 7. 设置画笔的字体 setFont(Font font)
 * 8. 设置画笔的颜色 setColor(Color c)
 * 演示下的具体用法 GraphicsMethod.java
 */
public class DrawCircle extends JFrame{// 对应一个窗口
    // 定义一个面板
    private MyPanel myPanel = null;
    public static void main(String[] args) {
        new DrawCircle();

//        System.out.println("退出程序");
    }

    public DrawCircle(){

        //初始化面板
        myPanel = new MyPanel();
        // 把面板放入窗口
        this.add(myPanel);
        // 设置窗口的大小
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 可以显示
        this.setVisible(true);

    }
    // 如何画圆
    // 先定义一个面板

}

class MyPanel extends JPanel {
    // 继承JPanel类，画图就在这里画

    /*
    当组件第一次在屏幕显示的时候，程序会自动调用paint()方法来绘制组件
    在以下情况paint()将会被调用：
    1.窗口最小化，再最大化
    2.窗口的大小发生变化
    3.repaint方法被调用
     */
    @Override
    public void paint(Graphics g) {// 绘图方法
        super.paint(g); // 调用父类的方法进行初始化
        System.out.println("paint被调用了！");
        g.drawOval(10,10,100,100);

        // 演示绘制不同的图形
        // 直线
        g.drawLine(10,10,100,100);
        // 矩形边框
        g.drawRect(10,10,100,100);
        // 填充矩形
        // 设置画笔颜色蓝色
        g.setColor(Color.blue);
        g.fillRect(10,10,100,100);
        // 填充椭圆
        // 设置画笔颜色红色
        g.setColor(Color.red);
        g.fillOval(10,10,50,100);
        // 画字符串
        g.setColor(Color.red);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("北京你好",100,100);

    }
}