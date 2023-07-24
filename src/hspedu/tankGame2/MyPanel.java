package hspedu.tankGame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

// 为了监听键盘事件，实现KeyListener;
public class MyPanel extends JPanel implements KeyListener {




    public static void main(String[] args) {
        HspTankGame02 hspTankGame01 = new HspTankGame02();

    }
    //绘图区
    //定义我的坦克
    Hero hero = null;
    //定义敌人坦克 放入vector中
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    public MyPanel() {
        hero = new Hero(100,100); // 初始化自己的坦克
        hero.setSpeed(5);
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100*(i+1)),0);
            enemyTank.setDirection(2);
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);// 填充矩形 默认是黑
        // 画出坦克-封装方法
        drawTank(hero.getX(),hero.getY(),g,hero.getDirection(),1);
//        drawTank(hero.getX()+60,hero.getY(),g,0,0);

        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(),g, enemyTank.getDirection(),0);
        }
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

        // 根据坦克的方向，来绘制对应形状的坦克
        // direction表示方向(0向上，1向右，2向下，3向左)

        switch(direction){
            case 0:
                g.fill3DRect(x, y,10,60,false);// 画出坦克左边的轮子
                g.fill3DRect(x+30, y,10,60,false);// 画出坦克右边的轮子
                g.fill3DRect(x+10,y+10,20,40,false);// 画出坦克身子
                g.fillOval(x+10,y+20,20,20); //画出圆形盖子
                g.drawLine(x+20,y+30,x+20,y); // 画出炮筒
                break;
            case 1:
                g.fill3DRect(x, y,60,10,false);// 画出坦克左边的轮子
                g.fill3DRect(x, y+30,60,10,false);// 画出坦克右边的轮子
                g.fill3DRect(x+10,y+10,40,20,false);// 画出坦克身子
                g.fillOval(x+20,y+10,20,20); //画出圆形盖子
                g.drawLine(x+30,y+20,x+60,y+20); // 画出炮筒
                break;
            case 2:
                g.fill3DRect(x, y,10,60,false);// 画出坦克左边的轮子
                g.fill3DRect(x+30, y,10,60,false);// 画出坦克右边的轮子
                g.fill3DRect(x+10,y+10,20,40,false);// 画出坦克身子
                g.fillOval(x+10,y+20,20,20); //画出圆形盖子
                g.drawLine(x+20,y+30,x+20,y+60); // 画出炮筒
                break;
            case 3:
                g.fill3DRect(x, y,60,10,false);// 画出坦克左边的轮子
                g.fill3DRect(x, y+30,60,10,false);// 画出坦克右边的轮子
                g.fill3DRect(x+10,y+10,40,20,false);// 画出坦克身子
                g.fillOval(x+20,y+10,20,20); //画出圆形盖子
                g.drawLine(x+30,y+20,x,y+20); // 画出炮筒
                break;
            default:
                System.out.println("暂时无法处理该事件");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){ //上
            hero.setDirection(0);
            hero.moveUp();
        }
        if(e.getKeyCode() == KeyEvent.VK_D){ //右
            hero.setDirection(1);
            hero.moveRight();
        }
        if(e.getKeyCode() == KeyEvent.VK_S){ //下
            hero.setDirection(2);
            hero.moveDown();
        }
        if(e.getKeyCode() == KeyEvent.VK_A){ //左
            hero.setDirection(3);
            hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
