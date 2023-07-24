package hspedu.string_;
/**
 * String类的常见方法应用实例
 * 1. equals // 区分大小写 判断内容是否相等
 * 2. equalsIgnoreCase // 忽略大小写判断内容是否相等
 * 3. length // 获取字符的个数，字符串的长度
 * 4. indexOf // 获取字符在字符串中第一次出现的索引，索引从0开始，如果找不到 返回-1
 * 5. lastIndexOf // 获取字符在字符串中最后一次出现的索引，索引从0开始，如果找不到 返回-1
 * 6. substring // 截取指定返回的子串
 * 7. trim // 去掉前后空格
 * 8. charAt // 获取某索引处的字符，注意不能使用Str[index]这种方式
 *
 * String str = "hello";
 * str[0]不对
 * System.out.println(str.charAt(1));
 */
public class StringMethod {
    public static void main(String[] args) {

        String username = "jOhn";
        if("john".equalsIgnoreCase(username)){
            System.out.println("success");
        }else{
            System.out.println("fail");
        }

        System.out.println("韩顺平.length()="+"韩顺平".length());

        String str = "thisIsNotMineGlasses";
        int index = str.indexOf('s');
        System.out.println("index of s in str(thisIsNotMineGlasses) is "+index);
        int lastIndex = str.lastIndexOf('s');
        System.out.println("last index of s in str(thisIsNotMineGlasses) is "+lastIndex);

        String name = "Hello,张三";
        // 不包括入这一个参数，substring()截取后面的字符
        System.out.println(name.substring(3));

        //substring( , ) 包括起始参数，不包括结尾参数
        System.out.println(name.substring(3,6));

        String space = " 我很 好 ";
        System.out.println(space.trim());


    }
}
