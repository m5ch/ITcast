package array;

import java.util.Random;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        //1、最大值
        int[] b = {15,100,200,150,-20};
        int max = b[0];
        for (int i = 1; i < b.length; i++) {
            if (max < b[i])
                max = b[i];
        }
        System.out.println(max);
        System.out.println("------------------");
        //2、冒泡排序
        int[] a = {15,90,43,-2,6,77};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]){
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("====================");
        //3、猜数字游戏
        Random r = new Random();
        int[] c = new int[5];
        for (int i = 0; i < c.length; i++) {
            c[i] = r.nextInt(1,21);
        }
        Scanner sc = new Scanner(System.in);
        OUT:
        while(true){
            System.out.print("输入:");
            int c1 = sc.nextInt();
            for (int i = 0; i < c.length; i++) {
                if (c1 == c[i]) {
                    System.out.println("猜中了！！");
                    System.out.println("在第" + (i + 1) + "个");
                    break OUT;
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "\t");
        }
    }
}
