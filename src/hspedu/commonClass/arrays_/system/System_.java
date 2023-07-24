package hspedu.commonClass.arrays_.system;

import java.util.Arrays;

public class System_ {

    public static void main(String[] args) {
        System.out.println("ok1");
//        System.exit(0);
        System.out.println("ok2");

        // arrayCopy
        int[] src = {1,2,3};
        int[] dest = new int[3];

        /*
        src 原数组
        srcPos 从原数组的哪个索引位置开始拷贝
        dest 目标数组
        destPos 把原数组的数据拷贝到目标数组的哪个索引
        length 从原数组拷贝多少个数据到目标数组
         */

        System.arraycopy(src,1,dest,1,2);
        System.out.println("dest="+ Arrays.toString(dest));

        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
    }
}
