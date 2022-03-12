package FlowControl;

import java.util.Scanner;

//目标：死循环
public class demo_5 {
    public static void main(String[] args) {
//        for (;;)
//            System.out.println("HelloWorld");
//
//        while(true)
//            System.out.println("你好");
//
//        do{
//            System.out.println("狐羽落");
//        }while(true);
        Scanner sc = new Scanner(System.in);
//        String str = "520";
//        String i = sc.next();
        int str = 520;
        while(true){
            System.out.print("请输入密码:");
//            String i = sc.next();
            int i = sc.nextInt();
            if (i == str)
                    break;
            else
                System.out.println("密码错误！");
        }
        System.out.println("欢迎使用！");
    }

}
