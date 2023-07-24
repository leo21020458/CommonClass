package hspedu.collection_.set;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {

    public static void main(String[] args) {
        // HashSet不保证元素是有序的，取决于hash后，再确定索引的结果（
        // 即不保证存放元素的顺序和取出顺序一致）

        /*
        在执行add方法后，会返回一个boolean值
        如果添加成功，返回true,否则返回false
        可以通过remove指定删除哪个对象
         */
        HashSet set = new HashSet();
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("rose"));

        set = new HashSet();
        System.out.println(set);
        System.out.println(set.add("lucy"));
        System.out.println(set.add("lucy"));

        Dog1 d = new Dog1("tom");

        System.out.println(set.add(d));
        System.out.println(set.add(d));
        System.out.println(set);


        System.out.println(set.add(new String("hsp")));
        System.out.println(set.add(new String("hsp")));




    }
}

class Dog1{
    private String name;

    public Dog1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog1{" +
                "name='" + name + '\'' +
                '}';
    }
}
