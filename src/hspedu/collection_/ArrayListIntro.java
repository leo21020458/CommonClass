package hspedu.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 *  ArrayList常用方法
 *  add: 添加单个元素
 *  remove: 删除指定元素
 *  contains: 查找元素是否存在
 *  size: 获取元素个数
 *  isEmpty: 判断是否为空
 *  clear: 清空
 *  addAll: 添加多个元素
 *  containsAll: 查找多个元素是否都存在
 *  removeAll: 删除多个元素
 */
public class ArrayListIntro {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        // add
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println(list);

        // remove
//      list.remove(0);
        list.remove(true);
        System.out.println(list);

        // contains
        System.out.println(list.contains("jack>"));

        // size
        System.out.println(list.size());

        // isEmpty
        System.out.println(list.isEmpty());

        // clear
//        list.clear();
//        System.out.println(list);
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        // addAll
        list.addAll(list2);
        System.out.println(list);

        // removeAll
        list.add("聊斋");
        list.removeAll(list2);
        System.out.println(list);
    }
}
