package oop.demo_7;

import java.util.Random;

//模拟开发验证码
public class test_3 {
    public static void main(String[] args) {
        //1、定义可能出现的字符信息
        String datas = "abcdefghijklmnopqrstuvWxyzABCDEFGHIJKLNNOPQRSTUVWXYZ0123456789";
        String s = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(datas.length());
            char ch = (char)datas.charAt(index);
            s += ch;
        }
        System.out.println(s);
    }


}
