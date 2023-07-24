package hspedu.set.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        // 在index = 1 的位置插入一个对象
        list.add(1,"韩顺平");

        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1,list2);
        System.out.println(list);

        System.out.println(list.indexOf("tom"));

        list.add("韩顺平");
        System.out.println(list.lastIndexOf("韩顺平"));

        list.remove(0);
        System.out.println(list);

        // 原先索引为1的被替换成玛丽
        // 原先索引的位置必须要有Object
        list.set(1,"玛丽");

        // subList 前闭后开 fromIndex <= subList < toIndex
        List returnList = list.subList(0,2);
        System.out.println(returnList);

    }
}
