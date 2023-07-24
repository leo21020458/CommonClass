package hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod {
    public static void main(String[] args) {
        Integer[] integers = {1,20,90};
        for(int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
        // 使用Arrays.toString
        System.out.println(Arrays.toString(integers));

        Integer arr[] = {1,-1,7,0,89};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}
