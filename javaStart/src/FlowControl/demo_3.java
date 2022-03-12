package FlowControl;

import java.util.Scanner;

//目标：for循环
public class demo_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello world");
        }
        int j , sum = 0;
        for (j = 0;j<=100;j++)
            sum += j;
        System.out.println(sum);
        System.out.println("------------------");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int f = 0 , d = 0 ;
        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0)
                d += i;
            else
                f += i;
        }
            System.out.println(f);
            System.out.println(d);

        System.out.println("-------------");
        int a , b , c;
        for (int i = 100; i < 1000; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;
            if (a*a*a + b*b*b + c*c*c == i)
                System.out.print(i + "\t");
        }

    }
}
