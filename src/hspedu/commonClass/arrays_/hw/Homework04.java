package hspedu.commonClass.arrays_.hw;

public class Homework04 {
    public static void main(String[] args) {
        String str = "abcde UUU 1203";
        countStr(str);
    }

    public static void countStr(String str){
        if(str == null){
            System.out.println("输入不能为空");
            return;
        }

        int strLen = str.length();
        int numCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int otherCount = 0;
        for (int i = 0; i < strLen; i++) {
            if(str.charAt(i)>='0'&& str.charAt(i)<='9'){
                numCount++;
            } else if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
                lowerCount++;
            } else if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                upperCount++;
            } else{
                otherCount++;
            }
        }
        System.out.println("数字有"+numCount);
        System.out.println("小写字母"+lowerCount);
        System.out.println("大写字母"+upperCount);
        System.out.println("其他字符"+otherCount);
    }
}
