package hspedu.collection_.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List 接口是 Collection 接口的子接口
 * 1. List 集合类中元素有序(即添加和取出的顺序一致)，且可以重复
 * 2. List 集合中每个元素都有其对应的顺序索引，即支持索引
 * 3. List 集合中的每个元素都对应一个整数型的序号记 载其在容器中的位置，可以根据序号hkjsdhkdjhakshdkahd存取容器中的元素
 */
public class List01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");
        System.out.println(list);
        // 索引从0开始
        System.out.println(list.get(3));

    }
}
