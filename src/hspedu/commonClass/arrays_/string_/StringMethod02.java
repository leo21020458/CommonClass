package hspedu.string_;

public class StringMethod02 {
    public static void main(String[] args) {
        // toUpperCase转换成大写
        String s = "hello";
        System.out.println(s.toUpperCase());

        // toLowerCase转换成小写
        String str = "HELLO";
        System.out.println(str.toLowerCase());

        // concat拼接字符串
        String s1 = "宝玉";
        s1 = s1.concat("林黛玉").concat("together");
        System.out.println(s1);

        // replace替换字符串中的字符
        String s2 = "你好 and 你好呀 你好呀 你好呀";
        s2 = s2.replace("你好呀","你坏呀");
        System.out.println(s2);

        // split分割字符串，对于某些分割字符，我们需要转义 比如| \\等
        String poem = "锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦";
        String[] splitPoem = poem.split("，");
        String poem1 = "E:\\aaa\\bbb";
        String[] splitPoem1 = poem1.split("\\\\");

        for (int i = 0; i < splitPoem.length; i++) {
            System.out.println(splitPoem[i]);
        }
        System.out.println();
        for (int i = 0; i < splitPoem1.length; i++) {
            System.out.println(splitPoem1[i]);
        }

        // toCharArray转换成字符串数组

        System.out.println();
        String s3 = "happy";
        char[] chs = s3.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        System.out.println();
        // compareTo比较两个字符串的大小
        // 如果前者大 则返回正数，后者大 则返回负数，如果相等，返回0
        String a = "jack1";
        String b = "jack1";
        System.out.println(a.compareTo(b));

        // format 格式化字符串
        /*
        占位符有：
        %s 字符串 %c 字符 %d 整型 %.2f 浮点型
         */

        String name = "john";
        int age = 10;
        double score = 98.3/3;
        char gender = '男';
        // 将所有信息都拼接在一个字符串
        String info = "我的姓名是"+name +"年龄是"+age +"成绩是"+score+"性别是"+gender;
        System.out.println(info);

        // %s 字符串 %c 字符 %d 整型 %.2f 浮点型
        // 称为占位符
        // 这些占位符由后面的变量来替换
        // 占位符 %.2f 只会保留小数点两位
        String info2 = String.format("我的姓名是%s 年龄是%d 成绩是%.2f 性别是%c.希望大家喜欢我"
                ,name,age,score,gender);
        System.out.println(info2);

    }
}
