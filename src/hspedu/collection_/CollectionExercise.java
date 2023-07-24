package hspedu.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        List arrayList= new ArrayList();
        arrayList.add(new Dog("小黑",3));
        arrayList.add(new Dog("小白",4));

        for (Object o :arrayList) {
            System.out.println(o);
        }


    }
}

class Dog{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
