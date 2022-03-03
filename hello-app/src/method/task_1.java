package method;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        //计算1-n的和
        Scanner sc = new Scanner(System.in);
        System.out.print("1.请输入:");
        int a = sc.nextInt();
        int sum = sum(a);
        System.out.println(sum);
        System.out.println("-=-=-=-=-=-=-=-=-=");
        //判断基偶数
        System.out.print("2.请输入:");
        int b = sc.nextInt();
        System.out.println(check(b));
    }

    public static int sum(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }

    public static String check(int a){
        if (a % 2 == 0)
            return "偶数";
        else
            return "基数";
    }

}
