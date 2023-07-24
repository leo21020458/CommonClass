package hspedu.thread.threadUse;

/**
 * 1.编写一个程序，开启一个线程，该线程每间隔一秒，在控制台输出"喵喵，我是小猫咪"
 * 2.对上题改进：当输出80次"喵喵，我是小猫咪" 结束该线程
 * 3.使用JConsole监控线程执行情况，并画出程序示意图
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException{

        Cat cat = new Cat();
        cat.start();//启动线程
        // 说明：当main线程启动一个子线程 Thread-0, 主线程不会阻塞，会继续执行
        System.out.println("主线程继续执行"+Thread.currentThread().getName()); // 名字main

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程 i="+i);
            //让主线程休眠
            Thread.sleep(1000);
        }

    }
}

/**
 * 当一个类继承了Thread类，该类就可以当作线程使用
 * 一般会重写run()方法，写上自己的业务逻辑
 * run Thread 类 实现了Runnable 接口的run方法
 */
class Cat extends Thread {

    int times = 0;

    @Override
    public void run() {
        super.run();
        while (true) {
            System.out.println("喵喵，我是小猫咪" + (++times)+" 线程名称："+Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times == 80){
                break;
            }
        }
    }
}