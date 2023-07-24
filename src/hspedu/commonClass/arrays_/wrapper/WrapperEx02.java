package hspedu.wrapper;

public class WrapperEx02 {

    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        /*
        IntegerCache.low(-128)~ IntegerCache.high(127)
        如果不在这个区间内，就new Integer(i)
         */
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
        // 两个对象 == 是判断是不是同一个对象

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}
