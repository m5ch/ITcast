package array;

import java.util.Scanner;

//目标：初始化数组,数组的定义、动态数组、数组遍历
public class demo_1 {
    public static void main(String[] args) {
//        int[] a = new int[]{1,2,3,4};
        int[] a = {1,2,3,4,5,6,};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("-----------------");
        System.out.print("输入:");
        Scanner sc = new Scanner(System.in);
        int[] b = new int[3];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
