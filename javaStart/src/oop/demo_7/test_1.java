package oop.demo_7;

import java.util.Scanner;

//模拟用户登录
public class test_1 {
    public static void main(String[] args) {
        String OKname = "ithema";
        String OKpassword = "123456";
        Scanner sc = new Scanner(System.in);
        System.out.print("输入用户名：");
        String name = sc.next();
        System.out.print("输入密码：");
        String password = sc.next();
        if (name.equals(OKname) && password.equals(OKpassword))
            System.out.println("登陆成功！");
        else
            System.out.println("请检查用户名或密码！");
    }
}
