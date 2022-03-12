package oop.demo_8;

import java.util.ArrayList;

//遍历并删除元素值
public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(98);
        list.add(65);
        list.add(100);
        list.add(88);
        list.add(79);
        list.add(53);
        System.out.println(list);
//        //有毛病的代码！！
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) < 80)
//                list.remove(list.get(i));
//        }
//        System.out.println(list);

        //解决方案 1： i退一位
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) < 80){
//                list.remove(list.get(i));
//                i--;      //删除成功后，退一步，回到这个位置，如此不会跳过数据
//            }
//        }
//        System.out.println(list);

        //解决方案2：倒着遍历再删除
        for (int i = list.size() - 1; i >= 0 ; i--) {
            if(list.get(i) < 80)
                list.remove(list.get(i));
        }
        System.out.println(list);

    }
}
