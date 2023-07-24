package hspedu.string_;



public class String01 {
    public static void main(String[] args) {
        // 创建方式1
        String s = "你好";
        String s2 = new String("你好呀");

        String a = "abc";
        String b = "abc";
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a == b.intern());
        System.out.println(b == b.intern());

        // 这里是在常量池里再次创建一个 haha字符串对象 并不会替换掉hello 只是会让 s1 = "haha"只是让 s1的指针指向haha

        String s1 = "hello";
        s1 = "haha";

        String a1 = "hello";
        String b1 = "abc";
        String c1 = a+b;
        String d1 = "helloabc";
        System.out.println(c1 == d1);
    }
}
