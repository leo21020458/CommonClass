package hspedu.generic;

import java.util.ArrayList;

/**
 * 编译时，检查添加元素的类型，提高了安全性
 * 减少了类型转换的次数，提高效率
 * 不使用泛型 放入到arraylist中会先专程object,在取出时还要转换成dog
 * 使用泛型时 放入和取出时不需要类型转换，提高效率
 * 不再提示编译警告
 */
public class Generic02 {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<>();
        arrayList.add(new Dog("旺财",10));
        arrayList.add(new Dog("发财",1));
        arrayList.add(new Dog("小黄",5));

        for (Dog o :arrayList) {
            System.out.println(o.getName()+"-"+ o.getAge());
        }

    }
}

class Dog1{
    private String name;
    private int age;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



class Cat1{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat1(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
