package hspedu.commonClass.arrays_.hw;

public class Homework03 {
    public static void main(String[] args) {
        String name = "Han shun Ping";
        printName(name);
        String name1 = "William Jefferson Clinton";
        printName(name1);
    }

    public static void printName(String str){
        if(str == null){
            System.out.println("str不能为空");
            return;
        }

        String[] names = str.split(" ");
        if(names.length != 3){
            System.out.println("输入的字符串格式不对");
            return;
        }

        String format = String.format("%s,%s .%c",names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
