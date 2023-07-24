package hspedu.collection_.map;

import java.util.*;

public class IterateMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","1.0");
        map.put("2","2.0");
        map.put("3","3.0");
        map.put("4","4.0");
        map.put("5","5.0");
        map.put("6","6.0");

        // 第一组 先取出所有的key 通过key 取出对应的value
        Set keyset = map.keySet();
        for (Object key :keyset) {
            System.out.println(key+"-"+map.get(key));
        }

        // Iterator
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key+"-"+map.get(key));
        }
        System.out.println();

        // 第二组 把所有的values取出
        Collection values = map.values();
        for (Object value :values) {
            System.out.println(values);
        }
        System.out.println();

        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println(value);

        }
        System.out.println();


        // 通过EntrySet 获取k-v
        Set entrySet = map.entrySet();
        for (Object entry :entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry =  iterator2.next();
            System.out.println(entry.getClass());// HashMap$Node
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }


    }
}
