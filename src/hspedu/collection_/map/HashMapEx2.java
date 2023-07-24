package hspedu.collection_.map;

import java.util.HashMap;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for(int i = 1; i<=12; i++){
            hashMap.put(new A(i),"hello");
        }
        System.out.println(hashMap);


    }
}

class A{
    private int num;

    public A(int num) {
        this.num = num;
    }

    // 所有A对象的hashCode都是100
    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }
}