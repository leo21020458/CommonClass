package hspedu.generic.custom;

/**
 *  tiger 后面泛型，所以我们把tiger称为自定义泛型类
 *  TRM 泛型的标识符，一般是单个大写字母
 *  泛型标识符可以有多个
 *
 *  普通成员可以使用泛型
 *  使用泛型的数组不能初始化，
 *  静态方法中不能使用类的泛型. 因为静态是和类相关的，在类加载时，对象还没有创建
 *  所以如果静态方法和静态属性使用了泛型，jvm 就无法完成初始化
 *  泛型类的类型是在创建对象时确定的，因为创建对象时需要指定确定类型。
 *  如果在创建对象时没有指定类型，默认为object
 */
public class CustomGeneric {
    public static void main(String[] args) {

    }
}


class Tiger<T,R,M>{
    String name;
    R r;

//    T[] ts  = new T[8];
    T[] ts;
//    public static void m1(M m){
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    M m;

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    T t;
}