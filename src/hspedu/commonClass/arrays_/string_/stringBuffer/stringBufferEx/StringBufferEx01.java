package hspedu.string_.stringBuffer.stringBufferEx;

public class StringBufferEx01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());

        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }
}
