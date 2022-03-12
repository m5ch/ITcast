package opreator;

import jdk.swing.interop.SwingInterOpUtils;

import javax.crypto.spec.PSource;

//目标：“+” 符号发、做连接符的识别
//方法：能算则算，不能算则在一起
public class demo_3 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("abc" + a);
        System.out.println("abc" + 'a');
        System.out.println(5 + a);
        System.out.println(15 + "abc" + a);
        System.out.println(a + 'a');
        System.out.println(a + "" + 'a');
        System.out.println("itcast" + a + 'a');
        System.out.println("itcast" + (a + 'a'));

    }
}
