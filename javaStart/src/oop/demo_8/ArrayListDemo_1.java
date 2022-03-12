package oop.demo_8;

import java.util.ArrayList;

//ArrayList 常用API
public class ArrayListDemo_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("goat");
        list.add("和那个都是");
        list.add("goat");
        list.add("呢哦i");
        list.add("瑙尔时");
        list.add("family");
        System.out.println(list);

        //1.获取某个索引位置的元素值
        String s1 = list.get(2);
        System.out.println(s1);

        //2.获取集合的大小（）元素个数
        System.out.println(list.size());

        //3.完成集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //4.删除某个索引位置的元素值，并返回该值
        String s2 = list.remove(4);
        System.out.println(s2);
        System.out.println(list);

        //5.直接删除元素值，成功返回true，失败返回false
        System.out.println(list.remove("goat"));
        System.out.println(list.remove("hello"));

        //6.修改某个索引位置处的元素值，返回修改前的元素值
        String s3= list.set(3,"你好");
        System.out.println(s3);
        System.out.println(list);

    }

}
