package hspedu.collection_.hw;

import java.sql.Array;
import java.util.ArrayList;

/**
 * 使用ArrayList 完成对对象Car{name,price} 的各种操作
 */
public class Hw02 {
    public static void main(String[] args) {
        Car a = new Car("11",1000000000);
        Car b= new Car("111",1000000000);
        Car c = new Car("1111",1000000000);

        ArrayList myArrayList = new ArrayList();
        myArrayList.add(new Car("宝马",400000));
        myArrayList.add(new Car("宾利",500000));
        myArrayList.add(new Car("宾利2",511100000));
        myArrayList.remove(2);
        System.out.println(myArrayList);
        System.out.println(myArrayList.contains(a));
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList);
        myArrayList.addAll(myArrayList);
        System.out.println(myArrayList);

        for (Object o :myArrayList) {
            System.out.println(o);
        }


    }
}

class Car{
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
}



