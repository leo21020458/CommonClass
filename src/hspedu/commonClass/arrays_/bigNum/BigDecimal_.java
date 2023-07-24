package hspedu.bigNum;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("12932938.234234339489384234234332");
        BigDecimal bigDecimal2 = new BigDecimal("2");

        // 保留分子的精度
        System.out.println(bigDecimal1.divide(bigDecimal2,BigDecimal.ROUND_CEILING));
    }
}
