package hspedu.math_;

import java.util.Random;

public class MathMethod {
    public static void main(String[] args) {
        // 绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);

        // 幂
        double pow = Math.pow(2,4);
        System.out.println(pow);

        // 向上取整
        double ceil = Math.ceil(3.00000001);
        System.out.println(ceil);

        // 向下取整
        double floor = Math.floor(-4.999);
        System.out.println(floor);

        // 四舍五入
        long round = Math.round(5.5001);
        System.out.println(round);

        // 开方
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);



    }
}
