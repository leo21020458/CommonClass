package hspedu.wrapper;

public class Integer01 {
    public static void main(String[] args) {
        int n1 = 100;
        // 手动装箱
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        // 手动拆箱
        // Integer -> int
        int i = integer.intValue();

        // jdk5后，就可以自动装箱和拆箱
        int n2 = 200;
        Integer integer2 = n2;

        int n3 = integer2;


    }
}
