package hspedu.set;

import java.util.ArrayList;

/**
 *  在ArrayList中可以添加所有类型的元素，并且可以加入一个或多个null
 *  ArrayList是线程不安全的 因为没有synchronized
 *  在多线程的是时候建议使用Vector
 *
 *  如果使用的是无参构造器 ArrayList的扩容机制是 10-(10*1.5)-(10*1.5)*1.5 ...
 *
 *  如果使用有参构造器 比如说 ArrayList(8) , 扩容机制是 8-8*1.5-(8*1.5)*1.5 ...
 *
 *  vector 是两倍扩容
 */
public class ArrayListDetail {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 400;
        System.out.println(arr.length);


        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(null);
        arrayList.add(true);
        arrayList.add("hello");
        System.out.println(arrayList);


    }
}
