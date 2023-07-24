package hspedu.collection_;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *  前面我们保存多个数据使用的是数组，那么数组有不足的地方
 *  1. 长度开始时必须制定，而且一旦指定，不能更改
 *  2. 保存的必须为同一类型元素
 *  3. 使用数组进行增加/删除元素的代码是比较麻烦的
 *
 *  集合
 *  1. 可以动态保存任意多个对象，使用起来比较方便
 *  2. 提供一系列方便操作对象的方法 add() remove() set() get()等
 *  3. 使用集合添加，删除新元素的代码更加简洁方便
 *
 *  集合主要是两组(单列集合，双列集合)
 *  Collection 接口有两个重要的子接口 List Set ,他们的实现子类都是单列集合
 *  Map 接口实现子类 是双列集合，存放的是 key-value
 *
 *  有些Collection的实现类 可以存放重复的元素，有些不可以
 *  有些Collection的实现类 有些是有序的，有些不是有序的
 *  Collection接口没有直接的实现子类，是通过它的子接口Set 和 List来实现的
 */

public class SetIntro {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList<Object> myArrayList = new ArrayList<Object>();
        myArrayList.add("jack"); // 单列
        myArrayList.add("tom");

        HashMap<Object,Object> hashMap = new HashMap<Object,Object>();
        hashMap.put("No1","北京"); // 双列
        hashMap.put("No2","伤害");
    }
}
