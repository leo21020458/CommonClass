package hspedu.bigNum;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        long l = 2348888888999l;
        System.out.println("l="+l);
        long startTime = System.currentTimeMillis();
        BigInteger bigInteger1 = new BigInteger("123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990123456789320498573942384703489397502375027309548257205732184270870587390112345678990");
        BigInteger bigInteger2 = new BigInteger("12345678901123456230741348920027502845273410947825737017899999990");

        BigInteger result = bigInteger1.multiply(bigInteger2);
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("消耗的时间="+(endTime-startTime));



    }
}
