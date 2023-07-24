package hspedu.date;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        // 1. Calendar是一个抽象类，并且构造器是private
        // 2. 可以通过getInstance() 来获取实例
        // 3. 提供大量的方法和字段给程序员
        // 4. Calendar没有提供对应的格式化的类，因此需要程序员自己组合来输出
        // 5. 如果需要24小时制 Calendar.HOUR_OF_DAY


        Calendar c = Calendar.getInstance();
        System.out.println("c="+c);

        // 获取日历对象的某个日历字段
        System.out.println("年："+c.get(Calendar.YEAR));
        System.out.println("月："+(c.get(Calendar.MONTH)+1));
        System.out.println("日："+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时："+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("分钟："+c.get(Calendar.MINUTE));
        System.out.println("秒："+c.get(Calendar.SECOND));



    }

}
