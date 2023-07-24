package hspedu.generic.custom;

public class CustomGenericEx {
    public static void main(String[] args) {
        MyGeneric<Double,String,Integer> g = new MyGeneric<>("john");
        g.setT(10.9);
//        g.setT("yy"); 错误，类型不对
        MyGeneric a = new MyGeneric("john___");
        a.setT("yy");
        System.out.println(a);
    }
}

class MyGeneric<T,A,M>{
    String name;
    T t;
    A a;
    M m;

    public MyGeneric(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public M getM() {
        return m;
    }

    public MyGeneric(T t, A a, M m) {
        this.t = t;
        this.a = a;
        this.m = m;
    }

    public void setM(M m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "MyGeneric{" +
                "name='" + name + '\'' +
                '}';
    }
}