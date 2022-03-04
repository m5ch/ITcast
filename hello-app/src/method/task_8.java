package method;

import java.util.Random;
import java.util.Scanner;

//模拟双色球
/*
投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1-33中选择;蓝色球号码从1-16中选择
 */
public class task_8 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入号码:");
//        int[] in = new int[7];
//        for (int i = 0; i < 7; i++) {
//            in[i] = sc.nextInt();
//        }
        int[] out = res1();
        System.out.println("中奖号码是:");
        System.out.print("[");
        for (int i = 0; i < 7; i++) {
            System.out.print(i == 6 ? out[i] : out[i] + ",");
        }
        System.out.print("]");
//        System.out.println("您的号码是:");
//        System.out.print("[");
//        for (int i = 0; i < 7; i++) {
//            System.out.print(i == 6 ? in[i] : in[i] + ",");
//        }
//        System.out.print("]");
//        res2(out,in);
    }
    //随机生成号码，前六位不能重复
    public static int[] res1(){
        Random r = new Random();
        int[] a = new int[7];
        for (int i = 0; i < 6; i++) {
            while (true) {
                int data = r.nextInt(33) + 1;
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (data == a[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    a[i] = data;
                    break;
                }
            }
        }
        a[6] = r.nextInt(16) + 1;
        return a;
    }

    //对比号码
    public static void res2(int[] out, int[] in){
        byte flag = 1;
        byte count = 0;
        if ( out[6] != in[6])
                flag = 0;
        switch (flag){
            case 1:
                for (int i = 0; i < 6; i++) {
                    if (out[i] == in[i])
                        count++;
                }
                switch (count){
                    case 6:
                        System.out.println("恭喜您！！中了一等奖！！1000万！！！");
                        break;
                    case 5:
                        System.out.println("恭喜您！！中了三等奖！！500万！！！");
                        break;
                    case 4:
                        System.out.println("恭喜您！！中了四等奖！！200！！！");
                        break;
                    case 3:
                    case 2:
                        System.out.println("恭喜您！！中了五等奖！！10元！！！");
                        break;
                    case 1:
                        System.out.println("恭喜您！！中了六等奖！！5元！！！");
                        break;
                    default:
                        System.out.println("抱歉，您没中奖！！");
                }
                break;
            case 0:
                for (int i = 0; i < 6; i++) {
                    if (out[i] == in[i])
                        count++;
                }
                switch (count){
                    case 6:
                        System.out.println("恭喜您！！中了二等奖！！500万！！！");
                        break;
                    case 5:
                        System.out.println("恭喜您！！中了四等奖！！200元！！！");
                        break;
                    case 4:
                        System.out.println("恭喜您！！中了五等奖！！10元！！！");
                        break;
                    default:
                        System.out.println("抱歉，您没中奖！！");
                }
                break;
        }
    }

}
