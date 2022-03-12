package method;

import java.util.Scanner;

//数组元素的复制
public class task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数组长度:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        array(a);
    }

    public static void array(int[] a){
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0 ; i--) {
            b[i] = a[i];
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(i == a.length - 1 ? b[i] : b[i] + ",");
        }
        System.out.print("]");
    }
}
