package hspedu.commonClass.arrays_.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    // 第三代日期

    // 使用DateTimeFormat格式化

    public static void main(String[] args) {



        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String format = dtf.format(ldt);
        System.out.println("格式化的日期="+format);
        System.out.println("年="+ldt.getYear());
        // 范围英文单词
        System.out.println("月="+ldt.getMonth());
        // 返回阿拉伯数字
        System.out.println("月="+ldt.getMonthValue());
        System.out.println("日="+ldt.getDayOfMonth());
        System.out.println("时="+ldt.getHour());
        System.out.println("分="+ldt.getMinute());
        System.out.println("秒="+ldt.getSecond());
        LocalTime lt = LocalTime.now();
        System.out.println(lt.getNano());

        LocalDate now = LocalDate.now();
        LocalTime now2 = LocalTime.now();

        // 看看890天后是什么时候
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890天后："+dtf.format(localDateTime));


        // 看看3456分钟前是什么时候
        LocalDateTime localDateTime2 = ldt.minusMinutes(890);
        System.out.println("3456分钟前:"+dtf.format(localDateTime2));



    }

}
