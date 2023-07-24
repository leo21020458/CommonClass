package hspedu.string_.stringBuffer.stringBufferEx;

import java.util.Scanner;

/**
 * 输入商品名称和商品价格，要求打印效果示例，使用前面的学习方法完成
 * 商品名 商品价格
 * 手机   123，564.59
 * 要求：价格的小数点前面每三位用逗号隔开
 */
public class StringBufferEx02 {

    /*
    思路分析
    1.定义一个scanner对象，接收用户输入的价格（string）
    2. 希望使用到stringBuffer的insert，需要将string转换成stringBuffer
    3. 然后使用相关方法进行字符串的处理

     */
    public static void main(String[] args) {
        String name = "";
        String price = "";
        System.out.println("输入商品名称");
        Scanner myScannerName = new Scanner(System.in);
        name = myScannerName.next();
        System.out.println("输入商品价格");
        Scanner myScannerPrice = new Scanner(System.in);
        price = myScannerPrice.next();

        StringBuffer sb = new StringBuffer(price);
        for(int i = sb.lastIndexOf(".") - 3; i > 0 ; i -= 3){
            sb = sb.insert(i,",");
        }
        System.out.println("商品名   价格");
        System.out.print(name+"   "+sb);
    }
}
