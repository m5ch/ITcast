package FlowControl;

import java.util.Scanner;

//目标：while循环、do-while循环
public class demo_4 {
    public static void main(String[] args) {
        double i = 0.1;
        int count = 0;
        while (i < 8848860){
            i *= 2;
            count++;
        }
        System.out.println(count);
        System.out.println("---------------");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        do {
            System.out.println("你好！！");
            j++;
        }while (j<10);
    }

}
