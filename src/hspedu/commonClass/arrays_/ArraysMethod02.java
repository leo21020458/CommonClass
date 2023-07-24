package hspedu.arrays_;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,90,123,567};
        int index = Arrays.binarySearch(arr,1234);
        // binarySearch 通过二分搜索法进行查找，要求必须排序好
        // 如果数组中没有该元素，就返回它应该存在的位置+1取反
        System.out.println(index);

        // 从arr数组中，拷贝arr.length个元素到newArr数组中
        // 如果拷贝的长度>arr.length就在新数组后面加上null
        // 如果拷贝长度<0 就抛出异常 NegativeArraySizeException
        Integer[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newArr));

        Integer[] num = {9,3,2};
        // 使用99填充num数组，可以理解成替换原来的所有元素
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));

        //如果不是完全一样就返回false
        Integer[] arr2 = {1,2,90,123,567};
        boolean equals = Arrays.equals(arr,arr2);
        System.out.println(equals);

        List asList = Arrays.asList(2,3,4,5,6,7);
        System.out.println(asList);


    }
}
