package hspedu.tankGame2;

import javax.swing.*;

public class HspTankGame02 extends JFrame {

    MyPanel mp = null;
    public static void main(String[] args) {
        HspTankGame02 hspTankGame01 = new HspTankGame02();


    }

    public HspTankGame02(){
        mp = new MyPanel();
        this.add(mp); // 把面板（就是游戏绘图区域）加进窗口里去
        this.setSize(1000,750);
        this.addKeyListener(mp); // 增加一个监听事件，监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
