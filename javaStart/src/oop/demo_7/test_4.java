package oop.demo_7;

import java.util.Scanner;

//手机号码屏蔽
public class test_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  st = sc.next();
        String s1 = st.substring(0,3);
        String s2 = st.substring(7);
        String s3 = s1+"****"+s2;
        System.out.println(s3);

        String s4 = st.replace(st.substring(3,7),"****");
        System.out.println(s4);
    }
}
