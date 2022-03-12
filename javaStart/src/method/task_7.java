package method;

import java.util.Scanner;

//数字加密
/*
    某系统的数字密码:比如1983, 采用加密方式进行传输，规则如下:
    先得到每位数,然后每位数都加上5 ,再对10求余，最后将所有数字反转，得到- -串新数。
 */
public class task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        long c = Integer.parseInt(a);
        int[] b = new int[a.length()];
        for (int i = 1; i <= a.length(); i++) {
            long d = c;
            d %= 10;
            d += 5;
            d %= 10;
            c /= 10;
            System.out.print(d);
        }

    }
}
