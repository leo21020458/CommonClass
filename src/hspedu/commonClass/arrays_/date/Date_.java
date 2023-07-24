package hspedu.commonClass.arrays_.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ {
    public static void main(String[] args) throws ParseException {
        // 获取当前系统时间

        Date d1 = new Date();
        System.out.println(d1);
        Date d2 = new Date(9234567);
        System.out.println(d2);
        System.out.println(d1.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println(format);

        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println("parse="+sdf.format(parse));

    }



}
