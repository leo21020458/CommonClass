package hspedu.commonClass.arrays_.wrapper;

/**
 * 只要是 new，判==肯定是false 因为==是判定是否是同一个对象
 */
public class WrapperEx03 {
    public static void main(String[] args) {
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);


        Integer i3 = new Integer(130);
        Integer i4 = new Integer(130);
        System.out.println(i3 == i4);


        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6);

        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);

    }
}
