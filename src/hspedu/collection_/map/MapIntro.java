package hspedu.collection_.map;

import java.util.HashMap;

/**
 * key-value 键值对
 * map 实现类特点
 * 1.用于保存具有映射关系的数据
 * 2.Map中的key 和 value 可以是任何引用类型的数据
 * 3.Map中的key不允许重复
 * 4.Map中的value可以重复
 * 5.Map的key可以为null,value也可以为null ，注意key为null 只能有一个， value为null可以有多个
 * 6.常用String类作为Map的key
 * 7.key和value之间存在单向一对一关系，即通过指定的key总能找到对应的value
 */
public class MapIntro {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("no1","韩顺平");
        hashMap.put("no4","张无忌");
        hashMap.put("no2","张无忌");
        hashMap.put("no1","张三丰");
        hashMap.put("no3","张三丰");
        System.out.println(hashMap);
        System.out.println(hashMap.get("no2"));




    }
}
