package hspedu.commonClass.arrays_.hw;

public class Homework02 {
    public static void main(String[] args) {
        /* 输入用户名，密码，邮箱，如果信息录入正确，则提示注册成功，否则抛出异常
        要求：
        1. 用户名长度为2/3/4
        2. 密码的长度为6 要求全是数字
        3. 邮箱中包含@和. 并且@在.前面
         */
        String name = "jack";
        String pwd = "123456";
        String email = "jack@sohu.com";
        try {
            userRegister(name,pwd,email);
            System.out.println("恭喜你，注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String pwd, String email){

        int userLength = name.length();
        if(!(userLength >= 2 && userLength <= 4)){
            throw new RuntimeException("用户名长度为2或3或4");
        }

        if(!(pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("密码的长度为6 要求全是数字");
        }

        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if(!(i > 0 && j > i)){
            throw new RuntimeException("邮箱中包含@和. 并且@在.前面");
        }
    }

    public static boolean isDigital(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] < '0' || chars[i] > '9'){
                return false;
            }
        }
        return true;
    }
}
