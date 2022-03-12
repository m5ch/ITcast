package oop.demo_8;

import java.util.ArrayList;

//ArrayList对象
public class ArrayListDemo {
    public static void main(String[] args) {
        //1.创建ArrayList集合的对象
        ArrayList list = new ArrayList();

        //2.添加数据
        list.add("java");
        list.add("我");
        list.add(21);
        list.add(2,"狐羽落");
        System.out.println(list);
        System.out.println("------------");

//        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("那个叫哦i的");
        System.out.println(list1);
    }
}
