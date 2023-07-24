package hspedu.generic;

import java.util.*;

public class GenericEx {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();
        set.add(new Student("john",12));
        set.add(new Student("hsp",30));
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            Student next =  iterator.next();
            System.out.println(next);
        }

        HashMap<String, Student> hm = new HashMap<>();
        hm.put("milan",new Student("milan",28));
        hm.put("tom",new Student("tom",28));
        Set<Map.Entry<String,Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String,Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> next =  iterator1.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }




    }
}

class Student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}