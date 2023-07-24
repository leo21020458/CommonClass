package hspedu.collection_;

import java.util.*;

public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("hsp");
        list.add("tom");
//        Collections.reverse(list);
//        System.out.println(list);
//        //打乱顺序
//        Collections.shuffle(list);
//        System.out.println(list);

//        Collections.sort(list);
//        System.out.println("自然排序后");
//        System.out.println(list);

//        Collections.sort(list, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return((String)o1).length() - ((String)o2).length();
//            }
//        });
//        System.out.println("字符串长度大小排序"+list);

        Collections.swap(list,0,1);
        System.out.println(list);

        System.out.println("自然顺序的最大元素"+Collections.max(list));

        System.out.println("tom的出现次数"+Collections.frequency(list,"tom"));

        ArrayList dest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }

        Collections.copy(dest,list);
        System.out.println("dest="+dest);

        Collections.replaceAll(list,"tom","汤姆");
        System.out.println(list);

    }
}
