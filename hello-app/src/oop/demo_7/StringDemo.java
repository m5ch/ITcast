package oop.demo_7;

public class StringDemo {
    public static void main(String[] args) {
        //方法一：直接使用双引号得到字符串对象
        String name = "狐羽落";
        System.out.println(name);
        System.out.println("-=-=-=-=-=-=");

        //方法二：创建一个空字符串对象，不含有任何内容（几乎不用）
        String s1 = new String();
        System.out.println(s1);
        System.out.println("-=-=-=-=-=-=");

        //方法三：根据传入的字符串内容，创建字符串对象（几乎不用）
        String s2 = new String("你好");
        System.out.println(s2);
        System.out.println("-=-=-=-=-=-=");

        //方法四：根据字符数组的内容创建字符串对象
        char[] chars = {'a','b','中','国'};
        String s3 = new String(chars);
        System.out.println(s3);
        System.out.println("-=-=-=-=-=-=");

        //方法五：根据字节数组的内容，创建字符串对象
        byte[] bytes = {97,98,99,65,66,67};
        String s4 = new String(bytes);
        System.out.println(s4);
        System.out.println("--------------");

        //双引号创建的字符串对象，在字符串常量池中存储同一个。
        String ss1 = "abc";
        String ss2 = "abc";
        System.out.println(ss1 == ss2);
        System.out.println("===================");
        //通过new构造器创建的字符串对象，在堆内存中分开存储。
        byte[] bytes1 = {97,98,99,65,66,67};
        String ss3 = new String(bytes);
        String ss4 = new String(bytes);
//        System.out.println(ss3 == s4);
        System.out.println(ss3.equals(s4));
    }
}
