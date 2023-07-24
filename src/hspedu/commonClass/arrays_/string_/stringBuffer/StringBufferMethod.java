package hspedu.string_.stringBuffer;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("hello");
        s.append(',');
        s.append("张三丰");
        s.append("赵敏").append(100).append(true).append(10.5);
        System.out.println(s);

        // 删除索引为 >=start && <end 处的字符
        s.delete(11,14);
        System.out.println(s);

        s.replace(9,11,"周子若");
        System.out.println(s);

        int indexOfZSF = s.indexOf("张三丰");
        System.out.println(indexOfZSF);

        s.insert(9,"赵敏");
        System.out.println(s);

        System.out.println(s.length());


    }
}
