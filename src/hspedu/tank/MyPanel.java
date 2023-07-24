package hspedu.tank;

import javax.swing.*;
import java.awt.*;


public class MyPanel extends JPanel {

    public static void main(String[] args) {
        HspTankGame01 hspTankGame01 = new HspTankGame01();

    }
    //绘图区
    //定义我的坦克
    Hero hero = null;
    public MyPanel() {
        hero = new Hero(100,100); // 初始化自己的坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);// 填充矩形 默认是黑
        // 画出坦克-封装方法
        drawTank(hero.getX(),hero.getY(),g,0,1);
        drawTank(hero.getX()+60,hero.getY(),g,0,0);
    }

    /**
     *
     * @param x 坦克左上角x坐标
     * @param y 坦克左上角x坐标
     * @param g 画笔
     * @param direction 坦克方向（上下左右）
     * @param type 坦克类型
     */
    public void drawTank(int x , int y, Graphics g, int direction, int type){

        switch(type){
            case 0: // 我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1: // 敌人坦克
                g.setColor(Color.yellow);
                break;
        }

        // 根据坦克的方向，来绘制坦克
        switch(direction){
            case 0:
                g.fill3DRect(x, y,10,60,false);// 画出坦克左边的轮子
                g.fill3DRect(x+30, y,10,60,false);// 画出坦克右边的轮子
                g.fill3DRect(x+10,y+10,20,40,false);// 画出坦克身子
                g.fillOval(x+10,y+20,20,20); //画出圆形盖子
                g.drawLine(x+20,y+30,x+20,y); // 画出炮筒
                break;
        }

    }
}
