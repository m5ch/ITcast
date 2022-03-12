package method;

import java.util.Random;
import java.util.Scanner;

//开发验证码
//定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。
public class task_4 {
//我是废物！！
//    public static void main(String[] args) {
//        Random r = new Random();
//        for (int i = 0; i < 5; i++) {
//            int a = r.nextInt(48,57);
//            System.out.print((char)a);
//        }
//    }


//      看看老师的！！
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String code = codeCreat(q);
        System.out.println("随机验证码为:" + code);
    }


    public static String codeCreat(int q){
        Random r = new Random();
        String code = "";
        for (int i = 0 ; i < q ; i++) {
            //随机0、1、2
            int a = r.nextInt(3);
            char b;
//            code = "";
            switch (a){
                //大写字符
                case 0:
                    b = (char)r.nextInt(65,91);
                    code += b;
                    break;
                //小写字符
                case 1:
                    b = (char)r.nextInt(97,123);
                    code += b;
                    break;
                //数字
                case 2:
                    b = (char)r.nextInt(48,58);
                    code += b;
                    break;
            }
        }
        return code;
    }
}
