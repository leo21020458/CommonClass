package hspedu.collection_;

import java.util.Hashtable;
import java.util.Properties;

/**
 * 1.存放的元素是键值对 k-v
 * 2.hashtable的键和值都不能为null，否则会抛出NullPointerException
 * 3.hashTable 使用方法基本和HashMap一样
 * 4.hashTable 是线程安全的 hashMap是线程不安全的
 *
 * Properties 类继承自Hashtable类并且实现了Map接口，也是使用一种键值对的形式来保存数据
 * 它的使用特点和hashtable类似
 * Properties 还可以用于从xxx.properties文件中加载数据到Properties类对象，并且进行读取和修改
 * 说明：xxx.properties文件通常为配置文件，这个知识点在io流举例
 * 举个例子，把用户的密码存储到外部的一个文件，在程序启动的时候读取文件里面的信息
 *
 * 总结-开发中如何选择集合实现类(记住)
 * 在开发中，选择什么集合实现类，主要取决于业务操作特点，然后根据集合实现类特性进行选择，分析如下:
 * 1)先判断存储的类型(一组对象或一组键值对)
 * 2)一组对象:Collection接口 允许重复:List
 * 增删多:LinkedList[底层维护了一个双向链表]
 * 改查多:ArrayList[底层维护Object类型的可变数组
 * 不允许重复:Set
 * 无序:HashSet[底层是HashMap，维护了一个哈希表即(数组+链表+红黑树)排序:TreeSet
 * 插入和取出顺序一致:LinkedHashSet，维护数组+双向链表
 * 3)一组键值对:Map
 * 键无序:HashMap[底层是:哈希表jdk7:数组+链表，jdk8:数组+链表+红黑树]键排序:TreeMap
 * 键插入和取出顺序一致:LinkedHashMap读取文件 Properties
 */
public class HashTable01 {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("john",100); //ok
//        table.put(null,100); //异常
//        table.put("john",null); //异常
        table.put("lucy",100);//ok
        table.put("lic",100); // ok
        table.put("lic",80); // 替换
        System.out.println(table);

        /*
         底层有一个数组 hashtable$Entry[] 初始化大小为11
         threshold 临界值是8  == 11*0.75 到了八个就会进行扩容
         扩容：按照自己的扩容机制来进行即可
         当执行方法addEntry(hash,key,value,index); 添加k-v 封装到Entry
         当if(count >= threshold临界值) 满足时，就进行扩容
         */

        Properties properties = new Properties();
        properties.put("john",100);
//        properties.put(null,100); 空指针
//        properties.put("john",null); 空指针
        properties.put("lucy",100);
        properties.put("lic",100);
        properties.put("lic",88); // 如果相同的key 替换value
        System.out.println(properties);

        System.out.println(properties.get("lic"));
        properties.remove("lic");

        properties.put("john","约翰");
        System.out.println(properties);

    }
}
