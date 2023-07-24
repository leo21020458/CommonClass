package hspedu.wrapper;

//        System.out.println("str1="+str1);
//        System.out.println("str2="+str2);
//        System.out.println("str3="+str3);
//
//        if(str1 instanceof String){
//            System.out.println("str1 is String");
//        }
//        if(str2 instanceof String){
//            System.out.println("str2 is String");
//        }
//        if(str3 instanceof String){
//            System.out.println("str3 is String");
//        }

public class WrapperStr {
    public static void main(String[] args) {
        // 包装类(Integer)->String
        Integer i = 100;
        // 方式1
        String str1 = i+"";
        // 方式2
        String str2 = i.toString();
        // 方式3
        String str3 = String.valueOf(i);


        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);

        Integer i3 = new Integer(str4);

    }
}
