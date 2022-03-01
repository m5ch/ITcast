package FlowControl;

import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Random r = new Random();
        int b = r.nextInt(0,100) + 1;
        Scanner sc = new Scanner(System.in);
        int a , count = 6;
        for (;count >=0 ;count--) {
            System.out.print("剩余");
            System.out.println(count + 1 + "次");
            System.out.print("请输入数字:");
            a = sc.nextInt();
            if (a < b)
                System.out.println("小了");
            else if(a > b)
                System.out.println("大了");
            else{
                System.out.println("你赢了！！");
                break;
            }
            if (count == 0){
                System.out.println("游戏结束，你输了！");
                break;
            }
//            else
//                System.out.println("游戏结束，你赢了！！！");
        }


    }
}
