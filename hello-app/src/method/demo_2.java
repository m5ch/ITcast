package method;

import java.util.Scanner;

public class demo_2 {
    public static void main(String[] args) {
        //输出数组
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
    }
    public static void print(int[] arr){
        System.out.print("[");
        if (arr != null && arr.length > 0){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i == arr.length -1 ? arr[i] : arr[i] + ",");
            }
        }
        System.out.print("]");
    }
}
