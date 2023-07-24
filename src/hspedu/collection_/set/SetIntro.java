package hspedu.collection_.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *  Set 接口的基本介绍：
 *  1. 无序（添加和取出的顺序不一致），没有索引
 *  2. 不允许重复元素，所以最多包含一个null
 */
public class SetIntro {
    public static void main(String[] args) {
       Set set = new HashSet();
       set.add("john");
       set.add("lucy");
       set.add("jack");
       set.add("john");
       set.add(null);
       set.add(null);
       System.out.println(set);

       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
           Object obj =  iterator.next();
           System.out.println(obj);
       }

       System.out.println();

       set.remove(null);
       for (Object o :set) {
           System.out.println(o);
       }


    }
}
