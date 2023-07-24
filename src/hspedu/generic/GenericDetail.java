package hspedu.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    public static void main(String[] args) {
        // 推荐使用这种方式声明泛型
        List<Integer> list = new ArrayList<>();
        //不能放int进去，因为int是基本数据类型
//        List<int> list2 = new ArrayList<>();

        Pig<Animal> aPig = new Pig<Animal>(new Animal());
        // 如果这样写 泛型默认是Object
        ArrayList arrayList = new ArrayList(); //  ArrayList<Object> arrayList = new ArrayList();



    }
}
class Animal{}
class Pig<E>{
    E e;

    public Pig(E e) {
        this.e = e;
    }
}