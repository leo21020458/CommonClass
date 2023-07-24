package hspedu.commonClass.arrays_.wrapper;

public class WrapperEx01 {
    public static void main(String[] args) {
        Double d = 100d; // ok, 自动装箱 Double.valueOf(100d)
        Float f= 1.5f; // ok , 自动装箱 Float.valueOf(1.5f)

        Object obj1 = true? new Integer(1): new Double(2.0);
        System.out.println(obj1); // 三元运算符被看作为一个整体 Double 精度比 Integer高，所以会输出1.0

        Object obj2;
        if(true){
            obj2 = new Integer(1);
        }
        else{
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);
    }
}
